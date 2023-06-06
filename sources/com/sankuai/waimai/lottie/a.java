package com.sankuai.waimai.lottie;

import android.content.Context;
import android.os.AsyncTask;
import android.util.JsonReader;
import com.airbnb.lottie.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.o;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        public static ChangeQuickRedirect a;

        public static com.airbnb.lottie.a a(Context context, String str, l lVar) {
            Object[] objArr = {context, str, lVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1bb6f44ae1eec0540cc02e87b1e3c46f", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.airbnb.lottie.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1bb6f44ae1eec0540cc02e87b1e3c46f");
            }
            try {
                InputStream open = context.getAssets().open(str);
                AsyncTaskC0996a asyncTaskC0996a = new AsyncTaskC0996a(lVar);
                com.sankuai.waimai.launcher.util.aop.b.a(asyncTaskC0996a, o.a(), new JsonReader(new InputStreamReader(open)));
                return asyncTaskC0996a;
            } catch (IOException e) {
                throw new IllegalArgumentException("Unable to find file " + str, e);
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.lottie.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class AsyncTaskC0996a extends AsyncTask<JsonReader, Void, com.airbnb.lottie.e> implements com.airbnb.lottie.a {
        public static ChangeQuickRedirect a;
        private final l b;

        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(com.airbnb.lottie.e eVar) {
            com.airbnb.lottie.e eVar2 = eVar;
            Object[] objArr = {eVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d51aafb4b3b87a078917f8fa834f2d9e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d51aafb4b3b87a078917f8fa834f2d9e");
            } else if (this.b != null) {
                this.b.a(eVar2);
            }
        }

        public AsyncTaskC0996a(l lVar) {
            Object[] objArr = {lVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b74f8c77dcc7633426a176c86934f739", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b74f8c77dcc7633426a176c86934f739");
            } else {
                this.b = lVar;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public com.airbnb.lottie.e doInBackground(JsonReader... jsonReaderArr) {
            Object[] objArr = {jsonReaderArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08d85fcdfae8c3f83bf6bd49c0235e0b", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.airbnb.lottie.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08d85fcdfae8c3f83bf6bd49c0235e0b");
            }
            try {
                return com.airbnb.lottie.f.b(jsonReaderArr[0], (String) null).a;
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // com.airbnb.lottie.a
        public final void cancel() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7db35a36b0681c17ae7d53ba2f1b9b18", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7db35a36b0681c17ae7d53ba2f1b9b18");
            } else {
                cancel(true);
            }
        }
    }
}
