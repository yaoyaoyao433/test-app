package com.sankuai.waimai.business.page.home.head.majorcategory;

import android.util.LongSparseArray;
import android.widget.TextView;
import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageViewModel;
import com.sankuai.waimai.business.page.home.model.NavigateItem;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MajorCategoryViewModel extends PageViewModel {
    public static ChangeQuickRedirect a;
    public final int b;
    public final int c;
    int d;
    int e;
    protected LongSparseArray<Boolean> f;
    private final int g;
    private final int h;
    private final int i;
    private int j;

    public MajorCategoryViewModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c712d0d534a9e49e9986f3552b2eb99", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c712d0d534a9e49e9986f3552b2eb99");
            return;
        }
        this.g = 5;
        this.h = 2;
        this.i = 2;
        this.b = 10;
        this.c = 20;
        this.d = -1;
        this.e = -1;
        this.j = 0;
        this.f = new LongSparseArray<>();
    }

    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "717eebfe10b1eb7774a0b9e8b4c1423d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "717eebfe10b1eb7774a0b9e8b4c1423d");
            return;
        }
        int i = bVar.f;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.home.helper.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "11b053cc18c5caabbc445a2000725ad8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "11b053cc18c5caabbc445a2000725ad8");
        } else {
            if (i < 0) {
                i = Integer.MAX_VALUE;
            }
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "category_bubble_max_num", i);
        }
        this.f.clear();
    }

    public final void a(int i, NavigateItem navigateItem, String str, String str2, int i2) {
        Object[] objArr = {Integer.valueOf(i), navigateItem, str, str2, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffd7edcc0a1251debaa38694c743d022", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffd7edcc0a1251debaa38694c743d022");
            return;
        }
        long j = i;
        if (this.f.get(j) == null || !this.f.get(j).booleanValue()) {
            this.f.put(j, Boolean.TRUE);
            JudasManualManager.a a2 = JudasManualManager.b("b_fwSD2").a("c_m84bv26");
            a2.b = str2;
            a2.a("type", com.sankuai.waimai.business.page.home.helper.b.a().c ? 1 : 0).a(RaptorConstants.JS_BATCH_NUM, String.valueOf(i2)).a("cat_id", String.valueOf(navigateItem.getCode())).a("switch_gray", String.valueOf(navigateItem.getSwitchGray())).a("resource_id", String.valueOf(navigateItem.getResourceId())).a("stid", str).a("index", i).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba04e8ef7dc0b39e32698a769617f1ab", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba04e8ef7dc0b39e32698a769617f1ab")).intValue() : i % 5 == 0 ? i / 5 : (i / 5) + 1;
    }

    private int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f95277c63ef25af1cc193ca3bc47a273", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f95277c63ef25af1cc193ca3bc47a273")).intValue();
        }
        if (this.j != 0) {
            return this.j;
        }
        TextView textView = new TextView(com.meituan.android.singleton.b.a);
        textView.setTextSize(12.0f);
        textView.setText("美食");
        textView.setIncludeFontPadding(false);
        textView.measure(0, 0);
        this.j = textView.getMeasuredHeight();
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(boolean z, boolean z2) {
        int i;
        int i2 = 2;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13a9c1f86d6cc591fb2e38d883b516a1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13a9c1f86d6cc591fb2e38d883b516a1")).intValue();
        }
        if (z) {
            i = 54;
            i2 = z2 ? 3 : 6;
        } else if (z2) {
            i = 38;
        } else {
            i = 30;
            i2 = 4;
        }
        return g.a(com.meituan.android.singleton.b.a, 10.0f) + g.a(com.meituan.android.singleton.b.a, i) + g.a(com.meituan.android.singleton.b.a, i2) + b();
    }
}
