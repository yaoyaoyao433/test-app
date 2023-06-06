package com.sankuai.waimai.business.page.common.model;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.util.e;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.modular.eventbus.sharedata.SharedData;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.platform.widget.filterbar.view.model.SliderSelectData;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KingkongInfo extends SharedData {
    public static ChangeQuickRedirect a;
    public long b;
    public String c;
    public long d;
    public String e;
    public int f;
    public long g;
    public String h;
    public long i;
    public String j;
    public ArrayList<String> k;
    public ArrayList<SliderSelectData> l;
    public String m;
    public String n;
    public boolean o;
    public String p;
    public int q;
    public int r;

    public KingkongInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "484c033f5c40e6b457e63fce02c87da5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "484c033f5c40e6b457e63fce02c87da5");
            return;
        }
        this.b = 0L;
        this.d = 0L;
        this.e = "";
        this.f = 0;
        this.g = 0L;
        this.i = 0L;
        this.n = "";
        this.o = true;
        this.q = -1;
    }

    public final void a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b17f280c69a0b53d16c2f242b957d4b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b17f280c69a0b53d16c2f242b957d4b2");
            return;
        }
        this.i = f.a(intent, "sorttype", 0L);
        if (com.sankuai.waimai.platform.privacy.a.a().b()) {
            this.b = 910L;
        } else {
            this.b = f.a(intent, "categorytype", 0L);
        }
        this.k = a(f.a(intent, "multifiltercodes", (String) null));
        ArrayList<? extends Parcelable> b = f.b(intent, "sliderfiltercodes", (ArrayList<? extends Parcelable>) null);
        this.l = new ArrayList<>();
        if (b != null) {
            Iterator<? extends Parcelable> it = b.iterator();
            while (it.hasNext()) {
                Parcelable next = it.next();
                if (next instanceof SliderSelectData) {
                    this.l.add((SliderSelectData) next);
                }
            }
        }
        this.m = f.a(intent, "multifiltertext", (String) null);
        this.g = f.a(intent, "subcategorytype", 0L);
        this.c = f.a(intent, "categorytext", (String) null);
        this.h = f.a(intent, "subcategorytext", (String) null);
        this.j = f.a(intent, "sorttext", (String) null);
        this.e = f.a(intent, "navigatetext", (String) null);
        this.n = f.a(intent, "titletext", (String) null);
        this.o = f.a(intent, "showfilter", true);
        if (com.sankuai.waimai.platform.privacy.a.a().b()) {
            this.d = 910L;
        } else {
            this.d = f.a(intent, "navigate_type", 0L);
        }
        if (this.b == 0 || this.d == 0) {
            this.b = 910L;
            this.d = 910L;
        }
        this.q = f.a(intent, "_wm_preload_page_id_overridable_", -1);
    }

    public final void a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3851aa303d0a7ff18fbeacef1367d3b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3851aa303d0a7ff18fbeacef1367d3b7");
            return;
        }
        this.i = e.a(uri, "sorttype", 0L);
        if (com.sankuai.waimai.platform.privacy.a.a().b()) {
            this.b = 910L;
        } else {
            this.b = e.a(uri, "categorytype", 0L);
        }
        this.k = a(e.a(uri, "multifiltercodes", (String) null));
        this.m = e.a(uri, "multifiltertext", (String) null);
        this.g = e.a(uri, "subcategorytype", 0L);
        this.c = e.a(uri, "categorytext", (String) null);
        this.h = e.a(uri, "subcategorytext", (String) null);
        this.j = e.a(uri, "sorttext", (String) null);
        this.n = e.a(uri, "titletext", (String) null);
        this.o = e.a(uri, "showfilter", 0) == 0;
        if (com.sankuai.waimai.platform.privacy.a.a().b()) {
            this.d = 910L;
        } else {
            this.d = e.a(uri, "navigate_type", 0L);
        }
        this.f = e.a(uri, "resource_id", 0);
        this.p = e.a(uri, "extra_param", (String) null);
        this.r = e.a(uri, "wm_source", 0);
        if (this.b == 0 || this.d == 0) {
            this.b = 910L;
            this.d = 910L;
        }
    }

    public final void b(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1ee6af17eb2b974a4b3371af54087cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1ee6af17eb2b974a4b3371af54087cc");
            return;
        }
        a(intent.getData());
        this.e = f.a(intent, "navigatetext", (String) null);
        this.q = f.a(intent, "_wm_preload_page_id_overridable_", -1);
    }

    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "920e4646cc2a924f14ac6703ce687350", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "920e4646cc2a924f14ac6703ce687350");
            return;
        }
        this.i = bundle.getLong("sorttype", 0L);
        this.b = bundle.getLong("categorytype", 0L);
        this.k = bundle.getStringArrayList("multifiltercodes");
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("sliderfiltercodes");
        this.l = new ArrayList<>();
        if (!d.a(parcelableArrayList)) {
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                Parcelable parcelable = (Parcelable) it.next();
                if (parcelable instanceof SliderSelectData) {
                    this.l.add((SliderSelectData) parcelable);
                }
            }
        }
        this.g = bundle.getLong("subcategorytype", 0L);
        this.m = bundle.getString("multifiltertext", null);
        this.j = bundle.getString("sorttext", null);
        this.h = bundle.getString("subcategorytext", null);
        this.c = bundle.getString("categorytext", null);
        this.n = bundle.getString("titletext", null);
        this.e = bundle.getString("navigatetext", null);
        this.o = bundle.getBoolean("showfilter", true);
        this.d = bundle.getLong("navigate_type", 0L);
    }

    private ArrayList<String> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6087a8c4fac4d28713eb6b878152b318", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6087a8c4fac4d28713eb6b878152b318");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(CommonConstant.Symbol.COMMA);
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : split) {
            try {
                arrayList.add(str2);
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.e("getPoiMultiFilterCodes", e.getLocalizedMessage(), new Object[0]);
            }
        }
        return arrayList;
    }
}
