package com.sankuai.waimai.ugc.creator.entity.inner;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public final List<MediaData> d;
    public final List<ImageData> e;
    public final SparseIntArray f;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12acde92c62fbc87ca47bfef33cd91c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12acde92c62fbc87ca47bfef33cd91c6");
            return;
        }
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new SparseIntArray();
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efffbcab0c5ad1d4a6f5798bba0dcb88", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efffbcab0c5ad1d4a6f5798bba0dcb88")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return TextUtils.equals(this.b, aVar.b) && TextUtils.equals(this.c, aVar.c);
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b291b9cac9edaf6050b017c0995a4999", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b291b9cac9edaf6050b017c0995a4999")).intValue();
        }
        int hashCode = this.b != null ? this.b.hashCode() + 527 : 17;
        return this.c != null ? (hashCode * 31) + this.c.hashCode() : hashCode;
    }

    public final void a(MediaData mediaData) {
        Object[] objArr = {mediaData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "066e726146caa77f6db053c08f152af1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "066e726146caa77f6db053c08f152af1");
        } else if (mediaData == null || !FileUtils.isFileExist(mediaData.i)) {
        } else {
            this.d.add(mediaData);
            if (mediaData instanceof ImageData) {
                this.e.add((ImageData) mediaData);
                this.f.put(this.e.size() - 1, this.d.size() - 1);
            }
        }
    }

    public final void a(@NonNull List<VideoData> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "942a34e372491ddf97df69ae7c87b4d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "942a34e372491ddf97df69ae7c87b4d3");
            return;
        }
        a();
        this.d.addAll(list);
    }

    public final void b(@NonNull List<ImageData> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a14bb248c5e9cac2f36fc7194ba7e58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a14bb248c5e9cac2f36fc7194ba7e58");
            return;
        }
        a();
        this.d.addAll(list);
        this.e.addAll(list);
        if (com.sankuai.waimai.foundation.utils.b.b(this.e)) {
            return;
        }
        for (int i = 0; i < this.e.size(); i++) {
            this.f.put(i, i);
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eb2458c454a79ae97fc2285ed38d4a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eb2458c454a79ae97fc2285ed38d4a2");
            return;
        }
        this.d.clear();
        this.e.clear();
        this.f.clear();
    }
}
