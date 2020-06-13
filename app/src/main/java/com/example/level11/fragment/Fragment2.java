package com.example.level11.fragment;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.level11.Face;
import com.example.level11.R;
import com.example.level11.recycleviewAdapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class Fragment2 extends Fragment {
    private RecyclerView recycler;
    private List<Face> list;
    private recycleviewAdapter adapter;

    @BindView(R.id.tvcompany)
    TextView tvcompany;
    @BindView(R.id.tvoffice)
    TextView tvoffice;
    @BindView(R.id.tvten)
    TextView tvten;
    @BindView(R.id.tvinbrand)
    TextView tvinbrand;
    @BindView(R.id.tvfacebook)
    TextView tvfacebook;
    @BindView(R.id.tvbrand)
    TextView tvbrand;
    @BindView(R.id.tvmodel)
    TextView tvmodel;
    @BindView(R.id.tvma)
    TextView tvma;
    @BindView(R.id.tvmucdo)
    TextView tvmucdo;
    @BindView(R.id.tvstyle)
    TextView tvstyle;

    @BindView(R.id.rlcompany) RelativeLayout rlcompany;
    @BindView(R.id.rloffice) RelativeLayout rloffice;
    @BindView(R.id.rlten) RelativeLayout rlten;
    @BindView(R.id.rlinbrand) RelativeLayout rlinbrand;
    @BindView(R.id.rlfacebook) RelativeLayout rlfacebook;
    @BindView(R.id.rlbrand) RelativeLayout rlbrand;
    @BindView(R.id.rlmodel) RelativeLayout rlmodel;
    @BindView(R.id.rlma) RelativeLayout rlma;
    @BindView(R.id.rlmucdo) RelativeLayout rlmucdo;
    @BindView(R.id.rlstyle) RelativeLayout rlstyle;

    @BindView(R.id.rldeadline) RelativeLayout rldeadline;
    @BindView(R.id.tvdeadline) TextView tvdeadline;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_2, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recycler = view.findViewById(R.id.recycler);
        list = new ArrayList<>();
        list.add(new Face("Tailieu", R.drawable.ic_tuchoi));
        list.add(new Face("hyundaithanhcong", R.drawable.ic_tuchoi));
        list.add(new Face("hyundaithanhcong", R.drawable.ic_tuchoi));
        adapter = new recycleviewAdapter(list);
        recycler.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false);
        recycler.setLayoutManager(linearLayoutManager);
        recycler.setAdapter(adapter);
    }

    @OnClick(R.id.rlcompany)
    public void rlfficeClick(){
        final String[] company = new String[] {"Công ty TNHH Đông Nam Á", "Công ty Idocnet", "Tập đoàn VinGroup"};
                Showdialog(company, tvcompany);
    }
    @OnClick(R.id.rloffice)
    public void rlofficeClick(){
        final String[] office = new String[] {"Phòng chăm sóc khách hàng", "Phòng nhân sự", "Phòng họp"};
                Showdialog(office, tvoffice);
    }
    @OnClick(R.id.rlten)
    public void rltenClick(){
        final String[] ten = new String[] {"Lê Thu Mai", "Lê Nin", "Lê Lợi"};
                Showdialog(ten, tvten);
    }
    @OnClick(R.id.rlfacebook)
    public void rlfacebookClick(){
        final String[] facebook = new String[] {"FaceBook", "Gmail", "Youtube"};
                Showdialog(facebook, tvfacebook);
    }
    @OnClick(R.id.rlbrand)
    public void rlbrandClick(){
        final String[] brand = new String[] {"Brand BID", "Brand VCB", "Brand TCB"};
                Showdialog(brand,tvbrand);
    }
    @OnClick(R.id.rlinbrand)
    public void rlinbrandClick(){
        final String[] inbrand = new String[] {"Inbrand", "Banda", "Congphubanda"};
                Showdialog(inbrand,tvinbrand);
    }
    @OnClick(R.id.rlmodel)
    public void rlmodelClick(){
        final String[] model = new String[] {"Model ABVC", "Model MVVM", "Model MVP"};
                Showdialog(model, tvmodel);
    }
    @OnClick(R.id.rlma)
    public void rlmaClick(){
        final String[] ma = new String[] {"PR 0001", "PR 0002", "PR 0003"};
                Showdialog(ma, tvma);
    }
    @OnClick(R.id.rlmucdo)
    public void rlmucdoClick(){
        final String[] mucdo = new String[] {"Mediumn", "Large", "Small"};
                Showdialog(mucdo,tvmucdo);
    }
    @OnClick(R.id.rlstyle)
    public void rlstyleClick(){
        final String[] style = new String[] {"Khiếu nại", "Không khiếu nại", "Max khiếu nại"};
                Showdialog(style, tvstyle);
    }
    private void Showdialog(final String[] noidung, TextView t) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setItems(noidung, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                t.setText(noidung[i]);
                dialogInterface.dismiss();
            }
        });
        builder.create().show();
    }

    @OnClick(R.id.rldeadline)
    public void rldeadlineClick(){
        Calendar calendar = Calendar.getInstance();
        int date = calendar.get(Calendar.DATE);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        DatePickerDialog pickerDialog = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                calendar.set(i,i1, i2);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd - MM - yyyy");
                tvdeadline.setText(simpleDateFormat.format(calendar.getTime()));
            }
        },date,month,year);
        pickerDialog.show();
    }

}
