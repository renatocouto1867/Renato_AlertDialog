package com.example.renato_alertdialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private ArrayList<String> linguagemProgramacao;

    public MyAdapter(LayoutInflater inflater, ArrayList<String> linguagem) {
        this.inflater = inflater;
        this.linguagemProgramacao = linguagem;
    }

    @Override
    public int getCount() {
        return linguagemProgramacao.size();
    }

    @Override
    public Object getItem(int position) {
        return linguagemProgramacao.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String linguagemSelecionada = linguagemProgramacao.get(position);
        convertView=inflater.inflate(R.layout.lista_layout,null);
        TextView texto = convertView.findViewById(R.id.texto);
        texto.setText(linguagemSelecionada);
        return convertView;
    }
}
