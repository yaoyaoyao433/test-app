package com.meituan.msi.api.video.compress;

import android.net.Uri;
import android.os.AsyncTask;
import android.support.annotation.RequiresApi;
import com.meituan.msi.api.video.compress.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RequiresApi(api = 18)
/* loaded from: classes3.dex */
public final class b extends AsyncTask<Object, Float, Boolean> {
    public static ChangeQuickRedirect a;
    private c.a b;

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Boolean bool) {
        Boolean bool2 = bool;
        Object[] objArr = {bool2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e159c7466ca9666c6506f06891f5311", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e159c7466ca9666c6506f06891f5311");
            return;
        }
        super.onPostExecute(bool2);
        if (this.b != null) {
            if (bool2.booleanValue()) {
                this.b.a(true);
            } else {
                this.b.a(false);
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onProgressUpdate(Float[] fArr) {
        Float[] fArr2 = fArr;
        Object[] objArr = {fArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a3e26c63cb31cc71191b33159643384", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a3e26c63cb31cc71191b33159643384");
            return;
        }
        super.onProgressUpdate(fArr2);
        if (this.b != null) {
            fArr2[0].floatValue();
        }
    }

    public b(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e28856e88040fcdeb22b2a99b67c344", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e28856e88040fcdeb22b2a99b67c344");
        } else {
            this.b = aVar;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85c9db449e955da6a0479dc6988f33b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85c9db449e955da6a0479dc6988f33b4");
            return;
        }
        super.onPreExecute();
        if (this.b != null) {
            this.b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public Boolean doInBackground(Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "7956cb5b268db80084a44105f138a0e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "7956cb5b268db80084a44105f138a0e7");
        }
        try {
            return Boolean.valueOf(new a().a((Uri) objArr[0], (String) objArr[1], ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue(), ((Integer) objArr[4]).intValue(), new com.meituan.msi.api.video.compress.listner.a() { // from class: com.meituan.msi.api.video.compress.b.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.video.compress.listner.a
                public final void a(float f) {
                    Object[] objArr3 = {Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "02b8e3b753b6f8381973584a6b50a0ae", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "02b8e3b753b6f8381973584a6b50a0ae");
                    } else {
                        b.this.publishProgress(Float.valueOf(f));
                    }
                }
            }));
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }
}
