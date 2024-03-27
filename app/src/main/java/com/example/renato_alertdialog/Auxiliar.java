package com.example.renato_alertdialog;

import android.content.Context;

import androidx.fragment.app.FragmentManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Auxiliar {

    public static List<String> criaLista(Context context) {
        //converte o Array_string em elementos da lista
        return new ArrayList<>(Arrays.asList(context.getResources().getStringArray(R.array.linguagem_programacao)));
    }

    public static void removeItem(List<String> lista, String linguagem) {
        lista.remove(linguagem);
    }

    public static void openDialogFragment(FragmentManager fragmentManager, String dialog) {
        MyDialogfragment mdf = new MyDialogfragment();
        mdf.show(fragmentManager, dialog);
    }
}
