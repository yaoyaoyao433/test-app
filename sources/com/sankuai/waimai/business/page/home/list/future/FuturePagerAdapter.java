package com.sankuai.waimai.business.page.home.list.future;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.common.view.nested.NestedViewPager;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FuturePagerAdapter extends PagerAdapter implements com.sankuai.waimai.business.page.common.view.nested.e {
    public static ChangeQuickRedirect a;
    SparseArray<com.sankuai.waimai.business.page.common.arch.a> b;
    List<com.sankuai.waimai.business.page.home.list.future.model.a> c;
    PageFragment d;
    com.sankuai.waimai.rocks.expose.a e;
    public com.sankuai.waimai.business.page.common.arch.a f;
    private NestedViewPager g;

    @Override // android.support.v4.view.PagerAdapter
    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    public FuturePagerAdapter(PageFragment pageFragment, NestedViewPager nestedViewPager) {
        Object[] objArr = {pageFragment, nestedViewPager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4975f5e51ea5405f0606bcc0c4535a93", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4975f5e51ea5405f0606bcc0c4535a93");
            return;
        }
        this.f = null;
        this.b = new SparseArray<>();
        this.c = new ArrayList();
        this.d = pageFragment;
        this.g = nestedViewPager;
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fe68bc346bb93af59cca777e258bb80", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fe68bc346bb93af59cca777e258bb80")).intValue() : this.c.size();
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        Object[] objArr = {view, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ca9be0817e666560d877c80d8da57d4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ca9be0817e666560d877c80d8da57d4")).booleanValue() : view == ((com.sankuai.waimai.business.page.common.arch.a) obj).i();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1  */
    @Override // android.support.v4.view.PagerAdapter
    @android.support.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object instantiateItem(@android.support.annotation.NonNull android.view.ViewGroup r17, int r18) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.home.list.future.FuturePagerAdapter.instantiateItem(android.view.ViewGroup, int):java.lang.Object");
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "093ee9f7a088f80bab46b0d455ff8123", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "093ee9f7a088f80bab46b0d455ff8123");
        } else {
            viewGroup.removeView(((com.sankuai.waimai.business.page.common.arch.a) obj).i());
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public void notifyDataSetChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c709ee557e6dcb1f0bdb79745af46ac7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c709ee557e6dcb1f0bdb79745af46ac7");
        } else {
            super.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(List<com.sankuai.waimai.business.page.home.list.future.model.a> list, List<com.sankuai.waimai.business.page.home.list.future.model.a> list2) {
        boolean z;
        int i = 2;
        char c = 0;
        char c2 = 1;
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c29163880ff4ac7e66fbadf1e797295", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c29163880ff4ac7e66fbadf1e797295")).booleanValue();
        }
        if (list2 == null || this.c.size() == 0) {
            return false;
        }
        if (list.size() <= 0 || list.size() == list2.size()) {
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                com.sankuai.waimai.business.page.home.list.future.model.a aVar = list.get(i2);
                com.sankuai.waimai.business.page.home.list.future.model.a aVar2 = list2.get(i2);
                Object[] objArr2 = new Object[i];
                objArr2[c] = aVar;
                objArr2[c2] = aVar2;
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "deb1947043d889840ca6ad34e72537bd", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "deb1947043d889840ca6ad34e72537bd")).booleanValue();
                } else {
                    z = ((aVar.e == null || aVar.e.equals(aVar2.e)) && (aVar.f == null || aVar.f.equals(aVar2.f)) && ((aVar.h == null || aVar.h.equals(aVar2.h)) && (aVar.g == null || aVar.g.equals(aVar2.g)))) ? false : true;
                }
                if (z) {
                    return false;
                }
                i2++;
                i = 2;
                c = 0;
                c2 = 1;
            }
            return true;
        }
        return false;
    }

    @Override // com.sankuai.waimai.business.page.common.view.nested.e
    public final com.sankuai.waimai.business.page.common.arch.a a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cf8c7811adee9f8288f927e36bc512b", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.business.page.common.arch.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cf8c7811adee9f8288f927e36bc512b") : this.b.get(i);
    }

    @Override // android.support.v4.view.PagerAdapter
    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff9b13782fd2075a1b5c2bd700d5c897", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff9b13782fd2075a1b5c2bd700d5c897");
            return;
        }
        com.sankuai.waimai.business.page.common.arch.a aVar = (com.sankuai.waimai.business.page.common.arch.a) obj;
        if (aVar != this.f) {
            a(this.f, false);
            a(aVar, true);
            this.f = aVar;
        }
    }

    private void a(com.sankuai.waimai.business.page.common.arch.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aaa41243d5637bdb4919ff65f5851de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aaa41243d5637bdb4919ff65f5851de");
        } else if (aVar instanceof h) {
            ((h) aVar).a(z);
        }
    }
}
