package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c2e455eff489d6c8633c430d4101337", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c2e455eff489d6c8633c430d4101337");
        } else {
            this.b = new ArrayList();
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f275d779e4d8e0583b35efee67d50670", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f275d779e4d8e0583b35efee67d50670")).booleanValue() : b(this.b) >= 0;
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
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.a.a(java.util.List):void");
    }

    public final List<GoodsPoiCategory> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d89a6bf8e27707d705569780b7f76491", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d89a6bf8e27707d705569780b7f76491");
        }
        a(this.b, c());
        return this.b;
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7663f825f58da29c9b04f8bb03f4288c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7663f825f58da29c9b04f8bb03f4288c")).intValue() : b(this.b);
    }

    @Nullable
    public final GoodsPoiCategory d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2306aaa290de590eee6ba914df1856b", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2306aaa290de590eee6ba914df1856b");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fc79afaad85b15336ad4a5bd7b7ac7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fc79afaad85b15336ad4a5bd7b7ac7e");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cd2b7b03d49ca3fafb6dc7aa017e6e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cd2b7b03d49ca3fafb6dc7aa017e6e4");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00cac28867016de2a81c93c226ab0310", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00cac28867016de2a81c93c226ab0310")).intValue();
        }
        GoodsPoiCategory goodsPoiCategory = (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, c());
        if (goodsPoiCategory == null) {
            return 0;
        }
        return b(goodsPoiCategory.childGoodPoiCategory);
    }

    public final GoodsPoiCategory a(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cad516190e19ad177cbc6aa547b723c7", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cad516190e19ad177cbc6aa547b723c7") : (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, this.b.indexOf(goodsPoiCategory) + 1);
    }

    public final GoodsPoiCategory b(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3617d59ab94117c6fa4c5d6d4caa8593", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3617d59ab94117c6fa4c5d6d4caa8593") : (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, this.b.indexOf(goodsPoiCategory) - 1);
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d2415142302e490ad1dcddecb2c8db5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d2415142302e490ad1dcddecb2c8db5");
            return;
        }
        GoodsPoiCategory goodsPoiCategory = (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        a(goodsPoiCategory, goodsPoiCategory != null ? (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsPoiCategory.childGoodPoiCategory, i2) : null);
    }

    public final GoodsPoiCategory b(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2) {
        Object[] objArr = {goodsPoiCategory, goodsPoiCategory2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a4a08bcf95cda52c7767f13d0209680", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a4a08bcf95cda52c7767f13d0209680");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2abf56c54ac5b2ed211e0336ff6f773f", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2abf56c54ac5b2ed211e0336ff6f773f");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e54c71d9b1fc802e6e11556e84e27c7f", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e54c71d9b1fc802e6e11556e84e27c7f");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3ad7c20b9bd346680984beb915b015f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3ad7c20b9bd346680984beb915b015f");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1277bfc4efcd8c378c005acb321ff7a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1277bfc4efcd8c378c005acb321ff7a5");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82e7f5c9ee47babe6fe1c45c25d2d20a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82e7f5c9ee47babe6fe1c45c25d2d20a")).intValue();
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2b7962895115cf8f4a16817947f5a14", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2b7962895115cf8f4a16817947f5a14");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16de0b455e0f1219492e581302eaf2ce", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16de0b455e0f1219492e581302eaf2ce")).intValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa4501177554f56f3ce920a4ab004516", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa4501177554f56f3ce920a4ab004516");
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
