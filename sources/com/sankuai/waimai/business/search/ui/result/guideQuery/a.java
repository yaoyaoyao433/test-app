package com.sankuai.waimai.business.search.ui.result.guideQuery;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.util.ArrayMap;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.search.datatype.GuideQueryData;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends RecyclerView.a<C0866a> {
    public static ChangeQuickRedirect a;
    ArrayList<GuideQueryData.WmFilterItem> b;
    boolean c;
    ArrayMap<String, String> d;
    private Context e;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(@NonNull C0866a c0866a, int i) {
        final C0866a c0866a2 = c0866a;
        Object[] objArr = {c0866a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c5b344840fb64b206ea92b043feb5d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c5b344840fb64b206ea92b043feb5d9");
            return;
        }
        final GuideQueryData.WmFilterItem wmFilterItem = this.b.get(i);
        Object[] objArr2 = {c0866a2, wmFilterItem, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da0cdfa2841e7ebe55b8982f3aad0689", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da0cdfa2841e7ebe55b8982f3aad0689");
            return;
        }
        if (!TextUtils.isEmpty(wmFilterItem.picture)) {
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = this.e;
            a2.c = wmFilterItem.picture;
            a2.f = ImageQualityUtil.b();
            a2.i = R.drawable.wm_nox_search_meituan_poi_icon;
            a2.j = R.drawable.wm_nox_search_meituan_poi_icon;
            a2.a(c0866a2.b);
            c0866a2.f.setVisibility(8);
            c0866a2.b.setVisibility(0);
        } else {
            c0866a2.f.setVisibility(0);
            c0866a2.b.setVisibility(8);
            c0866a2.c.setText(wmFilterItem.name);
            c0866a2.g.setVisibility(8);
            if (!TextUtils.isEmpty(wmFilterItem.icon)) {
                c0866a2.g.setVisibility(0);
                b.a aVar = new b.a() { // from class: com.sankuai.waimai.business.search.ui.result.guideQuery.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a(Bitmap bitmap) {
                        Object[] objArr3 = {bitmap};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a770c05eb2640126766a24b165e7f157", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a770c05eb2640126766a24b165e7f157");
                        } else if (bitmap != null) {
                            c0866a2.g.setImageBitmap(bitmap);
                        }
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5dd7edd950f3166e34ade5a800d0976e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5dd7edd950f3166e34ade5a800d0976e");
                        } else {
                            c0866a2.g.setVisibility(8);
                        }
                    }
                };
                b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a3.b = this.e;
                a3.c = wmFilterItem.icon;
                a3.a(aVar);
            }
        }
        if (this.d.containsKey(wmFilterItem.code)) {
            c0866a2.e.setBackgroundColor(Color.parseColor("#33FFD161"));
            c0866a2.c.setTextColor(Color.parseColor("#FFB000"));
            c0866a2.c.setTypeface(Typeface.defaultFromStyle(1));
        } else {
            c0866a2.e.setBackgroundColor(Color.parseColor("#FAFAFA"));
            c0866a2.c.setTextColor(Color.parseColor("#575859"));
            c0866a2.c.setTypeface(null);
        }
        c0866a2.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.ui.result.guideQuery.a.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d4840d86a50d3ca0e0041834cc2693a8", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d4840d86a50d3ca0e0041834cc2693a8");
                    return;
                }
                if (a.this.c) {
                    for (String str : a.this.d.keySet()) {
                        if (TextUtils.equals(str, wmFilterItem.code)) {
                            a.this.d.remove(str);
                            a.this.notifyDataSetChanged();
                            return;
                        }
                    }
                    a.this.d.put(wmFilterItem.code, wmFilterItem.name);
                } else {
                    String str2 = "";
                    Iterator<String> it = a.this.d.keySet().iterator();
                    loop1: while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String next = it.next();
                        Iterator<GuideQueryData.WmFilterItem> it2 = a.this.b.iterator();
                        while (it2.hasNext()) {
                            if (TextUtils.equals(next, it2.next().code)) {
                                a.this.d.remove(next);
                                str2 = next;
                                break loop1;
                            }
                        }
                    }
                    if (!TextUtils.equals(str2, wmFilterItem.code)) {
                        a.this.d.put(wmFilterItem.code, wmFilterItem.name);
                    }
                }
                a.this.notifyDataSetChanged();
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final /* synthetic */ C0866a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bfe373cd6fd2b604cc59d109997c131", RobustBitConfig.DEFAULT_VALUE) ? (C0866a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bfe373cd6fd2b604cc59d109997c131") : new C0866a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_nox_search_guide_query_filter_list_item, viewGroup, false));
    }

    public a(Context context, GuideQueryData.WmFilterGroup wmFilterGroup, ArrayMap<String, String> arrayMap) {
        Object[] objArr = {context, null, arrayMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d28f60d770096fcb9680d85761432562", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d28f60d770096fcb9680d85761432562");
            return;
        }
        this.b = new ArrayList<>();
        this.c = false;
        this.e = context;
        this.d = arrayMap;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32d984489a9cf59a5f8afabd88e63d52", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32d984489a9cf59a5f8afabd88e63d52")).intValue() : this.b.size();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.search.ui.result.guideQuery.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0866a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        public ImageView b;
        public TextView c;
        public View d;
        public View e;
        LinearLayout f;
        ImageView g;

        public C0866a(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc6c60f9832c49f1d1646726b29aee2c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc6c60f9832c49f1d1646726b29aee2c");
                return;
            }
            this.b = (ImageView) view.findViewById(R.id.picture);
            this.c = (TextView) view.findViewById(R.id.filter_text);
            this.g = (ImageView) view.findViewById(R.id.filter_icon);
            this.f = (LinearLayout) view.findViewById(R.id.text_total);
            this.d = view;
            this.e = view.findViewById(R.id.holder);
        }
    }
}
