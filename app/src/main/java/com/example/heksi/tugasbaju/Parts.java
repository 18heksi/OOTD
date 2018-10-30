package com.example.heksi.tugasbaju;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Parts extends Fragment {
    //membuat variable tag
    private static String TAG = "PartsFragment";
    public static final String IMAGE_ID_LIST = "image_ids";
    public static final String LIST_INDEX = "list_index";
    private List<Integer> mImageIds;
    private Integer mListIndex;

    public Parts(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        if (savedInstanceState != null){
            mImageIds = savedInstanceState.getIntegerArrayList(IMAGE_ID_LIST);
            mListIndex = savedInstanceState.getInt(LIST_INDEX);
        }

        //melakukan inisiasi activity tsb sebagai fragment
        View rootView = inflater.inflate(R.layout.parts_layout_fragment,  container, false);

        //merefernsi id yang ada di layout fragment
        final ImageView imageView = (ImageView) rootView.findViewById(R.id.imageView_part_layout_fragment);

        //digunakan untuk mengecek terdapat gambar yang akan ditampilkan
        if (mImageIds != null){
            //mengambil gabar untuk ditampilkan
            imageView.setImageResource(mImageIds.get(mListIndex));
            //yang dilakukan ketika gambar diklik
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mListIndex < mImageIds.size()-1){
                        //ketika diklik no array akan bertambah dan menampilkan gambar sesuai array
                        mListIndex++;
                    }else {
                        mListIndex = 0;
                    }
                    imageView.setImageResource(mImageIds.get(mListIndex));
                }
            });
        }else {
            //ketika tidak ada gambar yang akan ditampilkan
            Log.v(TAG, "Fragment ini kosong");
        }

        return rootView;
    }

    //digunakan untuk memberikan nilai pada mImageIds
    public void setmImageIds(List<Integer> mImageIds) {
        this.mImageIds = mImageIds;
    }

    //digunakan untuk memberikan nilai pada mListIndex
    public void setmListIndex(Integer mListIndex) {
        this.mListIndex = mListIndex;
    }


    //untuk menyimpan variable array beserta index
    @Override
    public void onSaveInstanceState(@NonNull Bundle currentState) {
        currentState.putIntegerArrayList(IMAGE_ID_LIST, (ArrayList<Integer>) mImageIds);
        currentState.putInt(LIST_INDEX,mListIndex);
    }
}
