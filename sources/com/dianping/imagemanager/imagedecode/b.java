package com.dianping.imagemanager.imagedecode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.dianping.imagemanager.utils.d;
import com.dianping.imagemanager.utils.i;
import com.huawei.hms.api.ConnectionResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class b extends a {
    public static ChangeQuickRedirect b;
    public String f;
    public final File g;
    public String h;

    public b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f55d68c36544a57161e6e39e5bb50f2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f55d68c36544a57161e6e39e5bb50f2b");
            return;
        }
        this.f = str;
        this.g = this.f != null ? new File(this.f) : null;
        this.d = 0;
        this.h = str2;
    }

    @Override // com.dianping.imagemanager.imagedecode.a
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "868882e6d812ea114487a54537893daa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "868882e6d812ea114487a54537893daa")).booleanValue();
        }
        if (TextUtils.isEmpty(this.f)) {
            this.e = ConnectionResult.NETWORK_ERROR;
            return false;
        } else if (this.g != null && this.g.exists() && this.g.isFile()) {
            return true;
        } else {
            this.e = ConnectionResult.RESOLUTION_REQUIRED;
            return false;
        }
    }

    @Override // com.dianping.imagemanager.imagedecode.a
    public final i.a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c05d3c4f0fbde62865be5c9eecc41a2", RobustBitConfig.DEFAULT_VALUE) ? (i.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c05d3c4f0fbde62865be5c9eecc41a2") : i.a(this.f, this.h);
    }

    @Override // com.dianping.imagemanager.imagedecode.a
    public final BitmapFactory.Options c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a1464ddc0f777be8e41fc45b19da254", RobustBitConfig.DEFAULT_VALUE)) {
            return (BitmapFactory.Options) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a1464ddc0f777be8e41fc45b19da254");
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.sankuai.waimai.launcher.util.image.a.a(this.f, options);
        return options;
    }

    @Override // com.dianping.imagemanager.imagedecode.a
    public final Bitmap a(BitmapFactory.Options options) {
        Object[] objArr = {options};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ac6da792a2b5c2e6df30bb5a75927b1", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ac6da792a2b5c2e6df30bb5a75927b1") : com.sankuai.waimai.launcher.util.image.a.a(this.f, options);
    }

    @Override // com.dianping.imagemanager.imagedecode.a
    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcd615f0ff06215b55216dc0f5ed3484", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcd615f0ff06215b55216dc0f5ed3484")).intValue() : a(this.f);
    }

    @Override // com.dianping.imagemanager.imagedecode.a
    public byte[] a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36f7b4c5d8688b483cfa7e1109129ff3", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36f7b4c5d8688b483cfa7e1109129ff3") : d.a(this.g);
    }
}
