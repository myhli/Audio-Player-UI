package com.example.belajarandroid10pplg02;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class AudioPlayer extends RecyclerView.Adapter<AudioPlayer.ViewHolder> {
    private List<AudioModel> listAudio;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(AudioModel audio);
    }
    public AudioPlayer(List<AudioModel> listAudio, OnItemClickListener listener) {
        this.listAudio = listAudio;
        this.listener = listener;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvLagu, tvPembuat, tvGenre, tvJumlahPendengar;
        ImageView tvImg;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvLagu = itemView.findViewById(R.id.lagu);
            tvPembuat = itemView.findViewById(R.id.pembuat);
            tvGenre = itemView.findViewById(R.id.genre);
            tvJumlahPendengar = itemView.findViewById(R.id.jumlahpendengar);
            tvImg = itemView.findViewById(R.id.img);
        }
    }

    @NonNull
    @Override
    public AudioPlayer.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_audio_player, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AudioPlayer.ViewHolder holder, int position) {
        AudioModel audioItem = listAudio.get(position);
        holder.tvLagu.setText(audioItem.getLagu());
        holder.tvPembuat.setText(audioItem.getPembuat());
        holder.tvGenre.setText(audioItem.getGenre());
        holder.tvJumlahPendengar.setText(String.valueOf(audioItem.getJumlahpendengar()) + " Pendengar");

        Glide.with(holder.itemView.getContext())
                .load(audioItem.getImgUrl())
                .into(holder.tvImg);

        holder.itemView.setOnClickListener(v -> {
            if (listener != null) {
                listener.onItemClick(audioItem);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listAudio.size(); // Pastikan return jumlah data, bukan 0
    }
}
