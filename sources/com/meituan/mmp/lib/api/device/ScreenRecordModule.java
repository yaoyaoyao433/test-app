package com.meituan.mmp.lib.api.device;

import android.app.Activity;
import android.arch.lifecycle.d;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.t;
import com.meituan.mmp.lib.LifecycleActivity;
import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.mmp.main.IEnvInfo;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.k;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.lang.ref.WeakReference;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ScreenRecordModule extends ServiceApi {
    public static ChangeQuickRedirect a;
    public static final Uri h = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
    private a i;
    private final t j;

    public ScreenRecordModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89e7b9506ca1432fe13da14e72ef5844", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89e7b9506ca1432fe13da14e72ef5844");
            return;
        }
        this.i = null;
        this.j = Privacy.createContentResolver(getContext(), "mmp_default_buzId");
    }

    public static /* synthetic */ boolean a(ScreenRecordModule screenRecordModule) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, screenRecordModule, changeQuickRedirect, false, "442b9d74c8c275b2e6a9da31d15b9a4f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, screenRecordModule, changeQuickRedirect, false, "442b9d74c8c275b2e6a9da31d15b9a4f")).booleanValue();
        }
        Activity a2 = screenRecordModule.a();
        if (a2 != null && (a2 instanceof LifecycleActivity)) {
            if (((LifecycleActivity) a2).getLifecycle().a().a(d.b.STARTED)) {
                return true;
            }
            com.meituan.mmp.lib.trace.b.b("ScreenRecordModule", "screen recorded but mini program is not in foreground");
            return false;
        }
        return false;
    }

    public static /* synthetic */ void b(ScreenRecordModule screenRecordModule) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, screenRecordModule, changeQuickRedirect, false, "68578f332c43f99244d23d4c22df7426", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, screenRecordModule, changeQuickRedirect, false, "68578f332c43f99244d23d4c22df7426");
            return;
        }
        IEnvInfo envInfo = MMPEnvHelper.getEnvInfo();
        String str = "";
        String str2 = "";
        String str3 = "";
        String str4 = "";
        if (screenRecordModule.f() != null && screenRecordModule.f().y() != null) {
            str4 = screenRecordModule.f().A();
            str3 = screenRecordModule.f().y().e().getPagePath();
        }
        if (MMPEnvHelper.getCityController() != null) {
            k cityController = MMPEnvHelper.getCityController();
            str2 = cityController.b();
            str = cityController.d();
        }
        try {
            if (new OkHttpClient().newCall(new Request.Builder().header("content-type", PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_JSON).post(new FormBody.Builder().add(DeviceInfo.USER_ID, envInfo.getUserID()).add("uuid", envInfo.getUUID()).add("sysName", "Android").add("appCode", envInfo.getAppCode()).add("appVersion", envInfo.getAppVersionName()).add("appId", str4).add("pagePath", str3).add("token", MMPEnvHelper.getMMPUserCenter().b()).add("city_name_loc", str).add("city_name_view", str2).build()).url("https://optimus-mtsi.meituan.com/mtsi-worker/12").build()).execute().isSuccessful()) {
                com.meituan.mmp.lib.trace.b.b("ScreenRecordModule", "post request success!!!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        return new String[0];
    }

    @Override // com.meituan.mmp.lib.api.ServiceApi
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fd186920d5650bcd0f3823483e3e6d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fd186920d5650bcd0f3823483e3e6d4");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e1376e65f23ee0efb9a74fa49c7a80d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e1376e65f23ee0efb9a74fa49c7a80d");
            return;
        }
        j();
        this.i = new a(null, this);
        this.j.a(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, (ContentObserver) this.i);
    }

    @Override // com.meituan.mmp.lib.api.ServiceApi
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6344669b297effd32f7af2edadd8fb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6344669b297effd32f7af2edadd8fb7");
        } else {
            j();
        }
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "117ae206b6c6f241ecff432000941645", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "117ae206b6c6f241ecff432000941645");
            return;
        }
        if (this.i != null) {
            this.j.a(this.i);
        }
        this.i = null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends ContentObserver {
        public static ChangeQuickRedirect a;
        public final WeakReference<ScreenRecordModule> b;
        private Uri c;

        public a(Handler handler, ScreenRecordModule screenRecordModule) {
            super(null);
            Object[] objArr = {null, screenRecordModule};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "745cbf27fd119add6246f8394b960fa2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "745cbf27fd119add6246f8394b960fa2");
            } else {
                this.b = new WeakReference<>(screenRecordModule);
            }
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z, Uri uri) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), uri};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44ad6e2bda2acb57b02133775e721d03", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44ad6e2bda2acb57b02133775e721d03");
            } else if (uri.equals(ScreenRecordModule.h) || !uri.getPath().contains(ScreenRecordModule.h.getPath())) {
            } else {
                super.onChange(z, uri);
                ScreenRecordModule screenRecordModule = this.b.get();
                if (screenRecordModule == null || uri == null || !ScreenRecordModule.a(screenRecordModule)) {
                    return;
                }
                if (this.c == null || !TextUtils.equals(this.c.getPath(), uri.getPath())) {
                    this.c = uri;
                    ScreenRecordModule.b(screenRecordModule);
                }
            }
        }
    }
}
