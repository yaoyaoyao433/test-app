package com.meituan.mmp.lib.api.video.compress;

import android.net.Uri;
import android.os.AsyncTask;
import android.support.annotation.RequiresApi;
import com.meituan.mmp.lib.api.video.compress.c;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3472db06de2f50d34b181774d023fc15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3472db06de2f50d34b181774d023fc15");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fb53ae982651b9c32e6a6a93fa68c4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fb53ae982651b9c32e6a6a93fa68c4a");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a11b282bcffce0ae172cce5cc4dc49df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a11b282bcffce0ae172cce5cc4dc49df");
        } else {
            this.b = aVar;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e39f891e081d8e715afae613ad98cfac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e39f891e081d8e715afae613ad98cfac");
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
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "0728ae673e854ec33960c1016b6656dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "0728ae673e854ec33960c1016b6656dc");
        }
        try {
            return Boolean.valueOf(new a().a((Uri) objArr[0], (String) objArr[1], ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue(), ((Integer) objArr[4]).intValue(), new com.meituan.mmp.lib.api.video.compress.listner.a() { // from class: com.meituan.mmp.lib.api.video.compress.b.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.api.video.compress.listner.a
                public final void a(float f) {
                    Object[] objArr3 = {Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "b81e6792e7b7c7bc3a6a4c917f4532a4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "b81e6792e7b7c7bc3a6a4c917f4532a4");
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
