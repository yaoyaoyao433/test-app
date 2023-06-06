package com.meituan.android.identifycardrecognizer.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.identifycardrecognizer.widgets.CircleImageView;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.DiskCacheStrategy;
import com.squareup.picasso.Picasso;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends RecyclerView.a {
    public static ChangeQuickRedirect a;
    Context b;
    ArrayList<String> c;
    int d;
    public ArrayList<String> e;
    public a f;
    C0261b g;
    private LayoutInflater h;
    private Point i;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(int i, String str);
    }

    public b(Context context, ArrayList<String> arrayList, int i) {
        Object[] objArr = {context, arrayList, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b56e5e3348cf90a65f18ee2f9f06326d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b56e5e3348cf90a65f18ee2f9f06326d");
            return;
        }
        this.d = 9;
        this.e = new ArrayList<>();
        this.g = null;
        this.b = context;
        this.c = arrayList;
        this.d = i;
        this.h = LayoutInflater.from(context);
        this.i = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            ((Activity) context).getWindowManager().getDefaultDisplay().getRealSize(this.i);
        } else {
            ((Activity) context).getWindowManager().getDefaultDisplay().getSize(this.i);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.s sVar, int i, List list) {
        Object[] objArr = {sVar, Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d066f359048bc8518cdd47df423df89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d066f359048bc8518cdd47df423df89");
            return;
        }
        c cVar = (c) sVar;
        if (list.isEmpty()) {
            onBindViewHolder(sVar, i);
        } else if (this.e.size() >= this.d && !this.e.contains(this.c.get(sVar.getAdapterPosition()))) {
            cVar.itemView.setEnabled(false);
            cVar.d.setVisibility(0);
        } else {
            cVar.itemView.setEnabled(true);
            cVar.d.setVisibility(8);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @SuppressLint({"InflateParams"})
    public final RecyclerView.s onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d483c3ea0dcb8c0f2ad556297ac8131", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d483c3ea0dcb8c0f2ad556297ac8131");
        }
        View inflate = this.h.inflate(R.layout.identifycard_recognizer_adapter_images_item, (ViewGroup) null);
        inflate.setLayoutParams(new ViewGroup.LayoutParams(this.i.x / 4, this.i.x / 4));
        return new c(inflate);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.s sVar, int i) {
        Object[] objArr = {sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcca7387534add18eea2f79cd0609305", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcca7387534add18eea2f79cd0609305");
            return;
        }
        c cVar = (c) sVar;
        int adapterPosition = sVar.getAdapterPosition();
        String str = this.c.get(adapterPosition);
        if (this.e.size() == this.d) {
            if (!this.e.contains(str)) {
                cVar.itemView.setEnabled(false);
                cVar.d.setVisibility(0);
            } else {
                cVar.itemView.setEnabled(true);
                cVar.d.setVisibility(8);
            }
        } else {
            cVar.itemView.setEnabled(true);
            cVar.d.setVisibility(8);
        }
        Picasso.g(this.b).d(str).a(DiskCacheStrategy.RESULT).a(this.i.x / 4, this.i.x / 4).e().a(true).f().a(cVar.b);
        if (this.d > 0) {
            if (this.e.contains(this.c.get(adapterPosition))) {
                cVar.c.setCicleColor(com.meituan.android.identifycardrecognizer.utils.a.b);
                cVar.c.setImageResource(R.drawable.identifycard_recognizer_photo_selector_check_not_select);
                cVar.c.setPadding(15, 15, 15, 15);
                a(cVar, true);
            } else {
                cVar.c.setCicleColor(0);
                cVar.c.setImageResource(R.drawable.identifycard_recognizer_icon_image_not_select);
                cVar.c.setPadding(0, 0, 0, 0);
                a(cVar, false);
            }
            cVar.c.setOnClickListener(com.meituan.android.identifycardrecognizer.adapter.c.a(this, str, cVar));
            new Handler().post(d.a(cVar));
        } else {
            cVar.c.setVisibility(8);
        }
        cVar.itemView.setOnClickListener(e.a(this, adapterPosition, str));
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onViewRecycled(RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9f9ffd56c689c1d6fa34914c54e21b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9f9ffd56c689c1d6fa34914c54e21b2");
            return;
        }
        if (sVar instanceof c) {
            c cVar = (c) sVar;
            if (cVar.b != null) {
                Picasso.b(cVar.b);
            }
        }
        super.onViewRecycled(sVar);
    }

    @MTPaySuppressFBWarnings({"SIC_INNER_SHOULD_BE_STATIC_ANON"})
    public final void a(ArrayList<String> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c0c02149b90c0890c60c718bb0a2d33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c0c02149b90c0890c60c718bb0a2d33");
            return;
        }
        if (this.g != null) {
            this.g.cancel(true);
        }
        this.g = new C0261b(this, arrayList);
        this.g.a(com.sankuai.android.jarvis.c.b(), new String[0]);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b39f99db95f5e5d89643429f217096b2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b39f99db95f5e5d89643429f217096b2")).intValue();
        }
        if (this.c == null) {
            return 0;
        }
        return this.c.size();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class c extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        ImageView b;
        CircleImageView c;
        View d;

        public c(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "884e0774beb308a724641abfe8f4b38c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "884e0774beb308a724641abfe8f4b38c");
                return;
            }
            this.b = (ImageView) view.findViewById(R.id.iv_image);
            this.c = (CircleImageView) view.findViewById(R.id.iv_select);
            this.d = view.findViewById(R.id.mask);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.identifycardrecognizer.adapter.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0261b extends com.meituan.android.paybase.asynctask.a<String, Integer, ArrayList<String>> {
        public static ChangeQuickRedirect a;
        private WeakReference<b> b;
        private ArrayList<String> c;

        @Override // com.meituan.android.paybase.asynctask.b
        public final /* synthetic */ void a(Object obj) {
            ArrayList<String> arrayList = (ArrayList) obj;
            Object[] objArr = {arrayList};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91faad1b693dc8b8968fc395a9fe5f5f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91faad1b693dc8b8968fc395a9fe5f5f");
                return;
            }
            super.a((C0261b) arrayList);
            b bVar = this.b.get();
            if (bVar != null) {
                bVar.c = arrayList;
                bVar.g = null;
                bVar.notifyDataSetChanged();
            }
        }

        public C0261b(b bVar, ArrayList<String> arrayList) {
            Object[] objArr = {bVar, arrayList};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c710495dde9b270ef68163e5cdc195f6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c710495dde9b270ef68163e5cdc195f6");
                return;
            }
            this.c = new ArrayList<>();
            this.b = new WeakReference<>(bVar);
            this.c.addAll(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.meituan.android.paybase.asynctask.b
        public ArrayList<String> a(String... strArr) {
            Object[] objArr = {strArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4fbe94fc47bd06ba60ac00dbd6715a5", RobustBitConfig.DEFAULT_VALUE)) {
                return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4fbe94fc47bd06ba60ac00dbd6715a5");
            }
            ArrayList<String> arrayList = new ArrayList<>(this.c);
            try {
                Collections.sort(this.c, new Comparator<String>() { // from class: com.meituan.android.identifycardrecognizer.adapter.b.b.1
                    public static ChangeQuickRedirect a;

                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(String str, String str2) {
                        String str3 = str;
                        String str4 = str2;
                        Object[] objArr2 = {str3, str4};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f081535156e8c35e4b3ff74848cba5c0", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f081535156e8c35e4b3ff74848cba5c0")).intValue();
                        }
                        File file = new File(str3);
                        File file2 = new File(str4);
                        if (file.lastModified() < file2.lastModified()) {
                            return 1;
                        }
                        return file.lastModified() == file2.lastModified() ? 0 : -1;
                    }
                });
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "PhotoSelectAdapter_SortFilesAsyncTask_doInBackground").a("message", e.getMessage()).b);
                this.c = arrayList;
            }
            return this.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "197f91ef7a1b62c814f072ffbfacb8b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "197f91ef7a1b62c814f072ffbfacb8b1");
        } else if (z) {
            cVar.c.setCicleColor(com.meituan.android.identifycardrecognizer.utils.a.b);
            cVar.c.setImageResource(R.drawable.identifycard_recognizer_photo_selector_selected);
            cVar.c.setPadding(15, 15, 15, 15);
        } else {
            cVar.c.setCicleColor(0);
            cVar.c.setImageResource(R.drawable.identifycard_recognizer_icon_image_not_select);
            cVar.c.setPadding(0, 0, 0, 0);
        }
    }
}
