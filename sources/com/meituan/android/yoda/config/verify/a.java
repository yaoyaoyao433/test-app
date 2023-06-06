package com.meituan.android.yoda.config.verify;

import android.content.Context;
import com.meituan.android.yoda.IYodaVerifyListener;
import com.meituan.android.yoda.bean.AESKeys;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.android.yoda.util.i;
import com.meituan.android.yoda.util.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements Runnable {
    public static ChangeQuickRedirect a = null;
    private static final String f = "a";
    public com.meituan.android.yoda.model.a[] b;
    public AESKeys c;
    public int d;
    public EnumC0375a e;
    private String g;
    private IYodaVerifyListener h;
    private WeakReference<Context> i;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.yoda.config.verify.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0375a {
        FACE_DETECTING,
        FACE_DETECTE_COMPLETE,
        FACE_IMAGE_UPLOADING,
        FACE_IMAGE_UPLOADED,
        FACE_COMPARING,
        FACE_COMPARE_SUCCESS;
        
        public static ChangeQuickRedirect a;

        EnumC0375a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c2794a6a510bdf739d11ddf5f7ba251", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c2794a6a510bdf739d11ddf5f7ba251");
            }
        }

        public static EnumC0375a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57ebfc9bd33cb926b3412412145b65e5", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0375a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57ebfc9bd33cb926b3412412145b65e5") : (EnumC0375a) Enum.valueOf(EnumC0375a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0375a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "171de1a14af19f2d952ab89f8281c29f", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0375a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "171de1a14af19f2d952ab89f8281c29f") : (EnumC0375a[]) values().clone();
        }
    }

    public a(Context context, String str, IYodaVerifyListener iYodaVerifyListener) {
        Object[] objArr = {context, str, iYodaVerifyListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fae6d525e094418efbc5e2b1b1e5610", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fae6d525e094418efbc5e2b1b1e5610");
            return;
        }
        this.i = new WeakReference<>(context);
        this.g = str;
        this.h = iYodaVerifyListener;
        this.e = EnumC0375a.FACE_DETECTING;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e93d7259d25f1d2903e370b855c214d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e93d7259d25f1d2903e370b855c214d");
            return;
        }
        switch (this.e) {
            case FACE_DETECTING:
                a(x.f(), null);
                return;
            case FACE_DETECTE_COMPLETE:
            case FACE_IMAGE_UPLOADING:
                a(x.g(), this.b);
                return;
            case FACE_IMAGE_UPLOADED:
            case FACE_COMPARING:
                a(x.f(), this.b);
                return;
            default:
                return;
        }
    }

    private void a(Error error, com.meituan.android.yoda.model.a[] aVarArr) {
        File a2;
        Object[] objArr = {error, aVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fa8464caad38f3c8fb1ec322c00ef58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fa8464caad38f3c8fb1ec322c00ef58");
        } else if (this.h == null) {
        } else {
            String str = null;
            try {
                str = "face_image_" + this.g;
            } catch (Exception unused) {
            }
            String str2 = "";
            if (this.i.get() != null && aVarArr != null && aVarArr.length > 0 && a() && (a2 = i.a(this.i.get().getApplicationContext(), aVarArr[0].b, str, this.c)) != null) {
                str2 = a2.getAbsolutePath();
            }
            com.meituan.android.yoda.monitor.log.a.a(f, "verifyTerminateCallback, requestCode = " + this.g + ", error = " + error.toString(), true);
            this.h.onFaceVerifyTerminal(this.g, error, aVarArr, str2);
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afbaa3f02d28e5424c7c4a883f262444", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afbaa3f02d28e5424c7c4a883f262444")).booleanValue() : this.d == 1;
    }
}
