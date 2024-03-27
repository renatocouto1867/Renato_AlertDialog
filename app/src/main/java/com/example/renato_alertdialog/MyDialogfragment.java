package com.example.renato_alertdialog;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class MyDialogfragment extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        builder.setTitle("Alerta!").
                setIcon(R.mipmap.ic_launcher).
                setMessage("Deseja excluir o item?").

                setPositiveButton("Sim", (dialogInterface, i) -> {
                    //não sei se é assim, mas foi a unica forma que eu consegui fazer.
                    Auxiliar.removeItem(MainActivity.lista, MainActivity.itemText);
                    MainActivity.myAdapter.notifyDataSetChanged();//para atualizar o adapter.
                    Toast.makeText(getActivity(), "Item excluido", Toast.LENGTH_SHORT).show();
                }).

                setNegativeButton("Não", (dialogInterface, i) -> Toast.makeText(getActivity(), "Operação cancelada", Toast.LENGTH_SHORT).show());

        return builder.create();
    }

}
