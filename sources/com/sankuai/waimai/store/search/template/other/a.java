package com.sankuai.waimai.store.search.template.other;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.store.search.adapterdelegates.b;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends b<com.sankuai.waimai.store.search.model.a, C1315a> {
    public static ChangeQuickRedirect a;

    public static /* synthetic */ void a(a aVar, com.sankuai.waimai.store.search.model.a aVar2) {
        Object[] objArr = {aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "4fca2e670d73096d5aae29276d04ece4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "4fca2e670d73096d5aae29276d04ece4");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("service_type", Integer.valueOf(aVar2.a));
        hashMap.put("keyword", aVar.l.h);
        hashMap.put("cat_id", Integer.valueOf(aVar.l.z));
        JudasManualManager.a("b_waimai_0ga19m64_mc").a((Map<String, Object>) hashMap).a();
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ C1315a a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59e6f9d6e53361681952103282055124", RobustBitConfig.DEFAULT_VALUE) ? (C1315a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59e6f9d6e53361681952103282055124") : new C1315a(layoutInflater.inflate(R.layout.wm_sc_nox_search_business_direct_card, viewGroup, false));
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull com.sankuai.waimai.store.search.model.a aVar, @NonNull C1315a c1315a, int i) {
        final com.sankuai.waimai.store.search.model.a aVar2 = aVar;
        final C1315a c1315a2 = c1315a;
        Object[] objArr = {aVar2, c1315a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "831ac6ab08e886b42da3d6a93bfcfe86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "831ac6ab08e886b42da3d6a93bfcfe86");
            return;
        }
        Object[] objArr2 = {c1315a2, aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d02a8ff5c966a299ae66e1410d02dea9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d02a8ff5c966a299ae66e1410d02dea9");
            return;
        }
        if (!aVar2.g) {
            aVar2.g = true;
            Object[] objArr3 = {aVar2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b6b3b445ece18df67a764aaa7c331d7a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b6b3b445ece18df67a764aaa7c331d7a");
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("cat_id", Integer.valueOf(this.l.z));
                hashMap.put("service_type", Integer.valueOf(aVar2.a));
                hashMap.put("keyword", this.l.h);
                JudasManualManager.b("b_waimai_0ga19m64_mv").a((Map<String, Object>) hashMap).a();
            }
        }
        c1315a2.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.other.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr4 = {view};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b8eb77369614e403dbaf9e39ed918d5e", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b8eb77369614e403dbaf9e39ed918d5e");
                    return;
                }
                a.a(a.this, aVar2);
                if (TextUtils.isEmpty(aVar2.c)) {
                    return;
                }
                com.sankuai.waimai.foundation.router.a.a(a.this.k, aVar2.c);
            }
        });
        c1315a2.b.setText(aVar2.f);
        c1315a2.c.setText(aVar2.b);
        if (!TextUtils.isEmpty(aVar2.e)) {
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = this.k;
            a2.c = aVar2.e;
            a2.f = ImageQualityUtil.a();
            a2.a(new b.d() { // from class: com.sankuai.waimai.store.search.template.other.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a() {
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a(int i2, Exception exc) {
                    Object[] objArr4 = {Integer.valueOf(i2), exc};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "42aac53fef32779977b1b9a807f089f0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "42aac53fef32779977b1b9a807f089f0");
                    } else {
                        c1315a2.a.setImageDrawable(new ColorDrawable(ColorUtils.a("#f4f4f4", -3355444)));
                    }
                }
            }).a(c1315a2.a);
        }
        if (TextUtils.isEmpty(aVar2.d)) {
            return;
        }
        b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
        a3.b = this.k;
        a3.c = aVar2.d;
        a3.f = ImageQualityUtil.b();
        a3.a(new b.d() { // from class: com.sankuai.waimai.store.search.template.other.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtimageloader.config.b.d
            public final void a() {
            }

            @Override // com.sankuai.meituan.mtimageloader.config.b.d
            public final void a(int i2, Exception exc) {
                Object[] objArr4 = {Integer.valueOf(i2), exc};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a3f7c3e66d08398cc45ed21a093d612b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a3f7c3e66d08398cc45ed21a093d612b");
                } else {
                    c1315a2.d.setImageDrawable(new ColorDrawable(ColorUtils.a("#f4f4f4", -3355444)));
                }
            }
        }).a(c1315a2.d);
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c63361ebd241be45cd53a74037fe06bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c63361ebd241be45cd53a74037fe06bb");
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c668d558ed665fe0452685ec884b989", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c668d558ed665fe0452685ec884b989")).booleanValue() : str.equals("wm_search_direct_card");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.search.template.other.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C1315a extends RecyclerView.s {
        public ImageView a;
        public TextView b;
        public TextView c;
        public ImageView d;

        public C1315a(View view) {
            super(view);
            this.a = (ImageView) view.findViewById(R.id.icon);
            this.b = (TextView) view.findViewById(R.id.name);
            this.c = (TextView) view.findViewById(R.id.desc);
            this.d = (ImageView) view.findViewById(R.id.brand);
        }
    }
}
