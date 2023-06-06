package com.sankuai.waimai.store.goods.list.templet.newmarket.presenter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public final List<GoodsPoiCategory> b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09ba0890ffee051abfe4f175b6990384", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09ba0890ffee051abfe4f175b6990384");
        } else {
            this.b = new ArrayList();
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2329053461a1aebd74e74bef90c54386", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2329053461a1aebd74e74bef90c54386")).booleanValue() : b(this.b) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void a(java.util.List<com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory> r20) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.a.a(java.util.List):void");
    }

    public final List<GoodsPoiCategory> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b619bbec08edab26c17f22ba6195e63", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b619bbec08edab26c17f22ba6195e63");
        }
        a(this.b, c());
        return this.b;
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3bf20fc1918a7f6eb0f7d29d82ecfa1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3bf20fc1918a7f6eb0f7d29d82ecfa1")).intValue() : b(this.b);
    }

    @Nullable
    public final GoodsPoiCategory d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40fca2e9d9ae473371c7d4b08f3065d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40fca2e9d9ae473371c7d4b08f3065d3");
        }
        int b = b(this.b);
        GoodsPoiCategory goodsPoiCategory = (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, b >= 0 ? b : 0);
        if (goodsPoiCategory != null) {
            goodsPoiCategory.selected = 1;
        }
        return goodsPoiCategory;
    }

    @Nullable
    public final GoodsPoiCategory e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c26d309c7e0eaeb9db5c90dd1338f93", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c26d309c7e0eaeb9db5c90dd1338f93");
        }
        GoodsPoiCategory c = c(this.b);
        if (c == null) {
            return null;
        }
        return com.sankuai.shangou.stone.util.a.b(c.childGoodPoiCategory) ? c : c(c.childGoodPoiCategory);
    }

    public final void a(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2) {
        Object[] objArr = {goodsPoiCategory, goodsPoiCategory2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df39b7ad6310e7c73ec1e2126286f624", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df39b7ad6310e7c73ec1e2126286f624");
        } else if (goodsPoiCategory == null) {
        } else {
            a(this.b, goodsPoiCategory);
            if (goodsPoiCategory2 == null) {
                goodsPoiCategory2 = (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsPoiCategory.childGoodPoiCategory, 0);
            }
            a(goodsPoiCategory.childGoodPoiCategory, goodsPoiCategory2);
        }
    }

    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9604b317bc81bc30f295eb2ba1cefccd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9604b317bc81bc30f295eb2ba1cefccd")).intValue();
        }
        GoodsPoiCategory goodsPoiCategory = (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, c());
        if (goodsPoiCategory == null) {
            return 0;
        }
        return b(goodsPoiCategory.childGoodPoiCategory);
    }

    public final GoodsPoiCategory g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c30bced7a51581f4f7e95838194f282", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c30bced7a51581f4f7e95838194f282");
        }
        return (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, c() + 1);
    }

    public final GoodsPoiCategory a(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1685b0f427125a6d644b8e5d94bfa396", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1685b0f427125a6d644b8e5d94bfa396") : (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, this.b.indexOf(goodsPoiCategory) + 1);
    }

    public final GoodsPoiCategory h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e184bf3e291c4545817d9a84dec36f90", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e184bf3e291c4545817d9a84dec36f90");
        }
        return (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, c() - 1);
    }

    public final GoodsPoiCategory b(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b605a86acaceb22c4df7d3ef33dcf02", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b605a86acaceb22c4df7d3ef33dcf02") : (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, this.b.indexOf(goodsPoiCategory) - 1);
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d7922380d37e1f39673d357270c72a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d7922380d37e1f39673d357270c72a7");
            return;
        }
        GoodsPoiCategory goodsPoiCategory = (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        a(goodsPoiCategory, goodsPoiCategory != null ? (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsPoiCategory.childGoodPoiCategory, i2) : null);
    }

    public final GoodsPoiCategory b(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2) {
        Object[] objArr = {goodsPoiCategory, goodsPoiCategory2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b827c12b5d0d59acf0c00de7b83883e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b827c12b5d0d59acf0c00de7b83883e7");
        }
        if (goodsPoiCategory == null) {
            return null;
        }
        if (goodsPoiCategory2 == null) {
            return (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsPoiCategory.childGoodPoiCategory, 0);
        }
        int d = d(goodsPoiCategory, goodsPoiCategory2);
        if (d < 0) {
            return null;
        }
        return (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsPoiCategory.childGoodPoiCategory, d + 1);
    }

    public final GoodsPoiCategory c(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2) {
        Object[] objArr = {goodsPoiCategory, goodsPoiCategory2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ed7a947738fdeeb6c062389531eee7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ed7a947738fdeeb6c062389531eee7e");
        }
        if (goodsPoiCategory == null) {
            return null;
        }
        if (goodsPoiCategory2 == null) {
            return (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsPoiCategory.childGoodPoiCategory, com.sankuai.shangou.stone.util.a.a((List) goodsPoiCategory.childGoodPoiCategory) - 1);
        }
        int d = d(goodsPoiCategory, goodsPoiCategory2);
        if (d < 0) {
            return null;
        }
        return (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsPoiCategory.childGoodPoiCategory, d - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoodsPoiCategory a(List<GoodsPoiCategory> list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a1193f0139b525005f41a804ee722ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a1193f0139b525005f41a804ee722ec");
        }
        if (TextUtils.isEmpty(str) || com.sankuai.shangou.stone.util.a.b(list)) {
            return null;
        }
        for (GoodsPoiCategory goodsPoiCategory : list) {
            if (goodsPoiCategory != null) {
                if (TextUtils.equals(goodsPoiCategory.getTagCode(), str) || TextUtils.equals(goodsPoiCategory.activityTag, str)) {
                    a(list, goodsPoiCategory);
                    return goodsPoiCategory;
                } else if (a(goodsPoiCategory.childGoodPoiCategory, str) != null) {
                    a(list, goodsPoiCategory);
                    return goodsPoiCategory;
                }
            }
        }
        return null;
    }

    private static void a(List<GoodsPoiCategory> list, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2efa2eae92a4be501ae2c5367a82ff60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2efa2eae92a4be501ae2c5367a82ff60");
        } else if (goodsPoiCategory != null) {
            for (GoodsPoiCategory goodsPoiCategory2 : list) {
                if (goodsPoiCategory2 != null) {
                    goodsPoiCategory2.selected = 0;
                    goodsPoiCategory2.previousNeighborState = false;
                    goodsPoiCategory2.nextNeighborState = false;
                }
            }
            goodsPoiCategory.selected = 1;
            a(list, list.indexOf(goodsPoiCategory));
        }
    }

    private static void a(List<GoodsPoiCategory> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "685986182610bbdf0175f135d15e7951", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "685986182610bbdf0175f135d15e7951");
            return;
        }
        int max = Math.max(0, i);
        GoodsPoiCategory goodsPoiCategory = (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) list, max + 1);
        GoodsPoiCategory goodsPoiCategory2 = (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) list, max - 1);
        if (goodsPoiCategory != null) {
            goodsPoiCategory.nextNeighborState = true;
        }
        if (goodsPoiCategory2 != null) {
            goodsPoiCategory2.previousNeighborState = true;
        }
    }

    private static int b(List<GoodsPoiCategory> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07aff6e7139b3ca25f5cb4c05a797282", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07aff6e7139b3ca25f5cb4c05a797282")).intValue();
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return -2;
        }
        for (int i = 0; i < list.size(); i++) {
            GoodsPoiCategory goodsPoiCategory = list.get(i);
            if (goodsPoiCategory != null && goodsPoiCategory.isSelected()) {
                return i;
            }
        }
        return -1;
    }

    private static GoodsPoiCategory c(List<GoodsPoiCategory> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a8c4761ef180abf65119a25340692de", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a8c4761ef180abf65119a25340692de");
        }
        int b = b(list);
        if (b < 0) {
            b = 0;
        }
        GoodsPoiCategory goodsPoiCategory = (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) list, b);
        if (goodsPoiCategory != null) {
            goodsPoiCategory.selected = 1;
        }
        return goodsPoiCategory;
    }

    private int d(@NonNull GoodsPoiCategory goodsPoiCategory, @NonNull GoodsPoiCategory goodsPoiCategory2) {
        Object[] objArr = {goodsPoiCategory, goodsPoiCategory2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff4498930332369bc8e3361b6f0e2744", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff4498930332369bc8e3361b6f0e2744")).intValue();
        }
        ArrayList<GoodsPoiCategory> arrayList = goodsPoiCategory.childGoodPoiCategory;
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) arrayList)) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (goodsPoiCategory2 == arrayList.get(i)) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] a(@NonNull String str, List<GoodsPoiCategory> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2031afe1b2f72ab741f7ab21c6290376", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2031afe1b2f72ab741f7ab21c6290376");
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            GoodsPoiCategory goodsPoiCategory = list.get(i);
            if (goodsPoiCategory != null) {
                if (str.equals(goodsPoiCategory.getTagCode())) {
                    return new int[]{i};
                }
                int[] a2 = a(str, goodsPoiCategory.childGoodPoiCategory);
                if (a2 != null) {
                    int[] iArr = new int[a2.length + 1];
                    iArr[0] = i;
                    System.arraycopy(a2, 0, iArr, 1, a2.length);
                    return iArr;
                }
            }
        }
        return null;
    }
}
