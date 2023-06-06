package com.meituan.android.identifycardrecognizer.adapter;

import android.content.Context;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.identifycardrecognizer.bean.PhotoFolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends RecyclerView.a<b> {
    public static ChangeQuickRedirect a;
    public InterfaceC0260a b;
    private List<PhotoFolder> c;
    private LayoutInflater d;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.identifycardrecognizer.adapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0260a {
        void a(PhotoFolder photoFolder);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(b bVar, int i) {
        b bVar2 = bVar;
        Object[] objArr = {bVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "189c26a86548e8aea0071c7e2bc3dc6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "189c26a86548e8aea0071c7e2bc3dc6d");
            return;
        }
        final PhotoFolder photoFolder = this.c.get(i);
        ArrayList<String> photoList = photoFolder.getPhotoList();
        bVar2.a.setText(photoFolder.getName());
        if (photoList != null && !photoList.isEmpty()) {
            bVar2.b.setText(Integer.toString(photoList.size()));
        } else {
            bVar2.b.setText("0");
        }
        bVar2.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.identifycardrecognizer.adapter.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "529e3c120587ce0c1acf2898a918e01b", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "529e3c120587ce0c1acf2898a918e01b");
                    return;
                }
                a.this.notifyDataSetChanged();
                if (a.this.b != null) {
                    a.this.b.a(photoFolder);
                }
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9798fb399964922ec724176abbd67182", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9798fb399964922ec724176abbd67182") : new b(this.d.inflate(R.layout.identifycard_recognizer_adapter_folder, viewGroup, false));
    }

    public a(Context context, List<PhotoFolder> list) {
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3347d9c5ef9889510bf866934df44675", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3347d9c5ef9889510bf866934df44675");
            return;
        }
        this.c = list;
        this.d = LayoutInflater.from(context);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87193686408e5f632fb0633f4e429b50", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87193686408e5f632fb0633f4e429b50")).intValue();
        }
        if (this.c == null) {
            return 0;
        }
        return this.c.size();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b extends RecyclerView.s {
        public TextView a;
        public TextView b;

        public b(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.tv_folder_name);
            this.b = (TextView) view.findViewById(R.id.tv_folder_size);
        }
    }
}
