package com.meituan.android.yoda.callbacks;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.yoda.IYodaVerifyListener;
import com.meituan.android.yoda.YodaConfirm;
import com.meituan.android.yoda.activity.YodaConfirmActivity;
import com.meituan.android.yoda.bean.YodaResult;
import com.meituan.android.yoda.model.b;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.android.yoda.util.p;
import com.meituan.android.yoda.util.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import io.agora.rtc.Constants;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e extends a {
    public static ChangeQuickRedirect c;
    public IYodaVerifyListener d;
    public YodaConfirm.a e;
    long f;
    String g;
    public boolean h;
    private IYodaVerifyListener i;
    private int j;
    private int k;
    private com.meituan.android.yoda.interfaces.f<Integer> l;
    private boolean m;
    private int n;
    private int o;

    @Override // com.meituan.android.yoda.interfaces.h
    public final /* synthetic */ void a(String str, @NonNull YodaResult yodaResult) {
        Error error;
        YodaResult yodaResult2 = yodaResult;
        Object[] objArr = {str, yodaResult2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dc3be281a783fddce305eb5a1c4a331", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dc3be281a783fddce305eb5a1c4a331");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("YodaPageDataCallback", "onSuccess, requestCode = " + str + ", yodaResult = " + yodaResult2.toString(), true);
        if (this.l != null) {
            this.l.a(1);
        }
        if (this.e.a() == null) {
            com.meituan.android.yoda.monitor.log.a.a("YodaPageDataCallback", "onSuccess, requestCode = " + str + ", yodaConfirmLifecycle.getActivity() = null.", true);
            Error b = x.b();
            x.a(this.e.a(), b.message);
            a(b);
            return;
        }
        if (yodaResult2.status == 1 && yodaResult2.data != null) {
            if (a(yodaResult2)) {
                return;
            }
        } else if (yodaResult2.error != null) {
            x.a(this.e.a(), yodaResult2.error.message);
            a(yodaResult2.error);
            return;
        }
        Error a = x.a();
        x.a(this.e.a(), a.message);
        a(a);
        b.a a2 = b.a.a();
        String yodaResult3 = yodaResult2.toString();
        Object[] objArr2 = {a, this, 100, yodaResult3};
        ChangeQuickRedirect changeQuickRedirect2 = b.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "291c4877060bfe2ba71759872a145997", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "291c4877060bfe2ba71759872a145997");
        } else if (Statistics.isInitialized()) {
            CopyOnWriteArrayList<Error> copyOnWriteArrayList = a2.b;
            Object[] objArr3 = {a, this, 100, yodaResult3};
            ChangeQuickRedirect changeQuickRedirect3 = b.a.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "d7a497aaf48f83066fb48607e9ee57c6", RobustBitConfig.DEFAULT_VALUE)) {
                error = (Error) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "d7a497aaf48f83066fb48607e9ee57c6");
            } else {
                Error error2 = new Error();
                error2.code = a.code;
                StringBuilder sb = new StringBuilder("msg:");
                sb.append(a.message);
                sb.append(" ,instance:");
                sb.append(getClass().getSimpleName());
                sb.append(" ,lineNum:");
                sb.append(100);
                if (yodaResult3 != null) {
                    sb.append(" ,extraMsg:");
                    sb.append(yodaResult3);
                }
                error2.message = sb.toString();
                error = error2;
            }
            copyOnWriteArrayList.add(error);
        }
    }

    public e(YodaConfirm.a aVar, IYodaVerifyListener iYodaVerifyListener) {
        Object[] objArr = {aVar, iYodaVerifyListener};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f98466f4d8a3f6162c5ddf46de6b6f1d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f98466f4d8a3f6162c5ddf46de6b6f1d");
            return;
        }
        this.j = 0;
        this.k = -1;
        this.m = false;
        this.n = -1;
        this.o = -1;
        this.f = 0L;
        this.d = iYodaVerifyListener;
        this.e = aVar;
        this.j = com.meituan.android.yoda.config.launch.b.a().a();
        this.k = com.meituan.android.yoda.config.launch.b.a().c();
        this.l = com.meituan.android.yoda.config.launch.b.a().b();
        if (this.l != null) {
            this.l.a(0);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        this.i = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f60d47ae4ea9ed81ec6661ba420bed4", RobustBitConfig.DEFAULT_VALUE) ? (IYodaVerifyListener) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f60d47ae4ea9ed81ec6661ba420bed4") : new IYodaVerifyListener() { // from class: com.meituan.android.yoda.callbacks.e.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.yoda.IYodaVerifyListener
            public final void onSuccess(String str, String str2) {
                Object[] objArr3 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c225644c1d36396cbb6e8b1340bb356b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c225644c1d36396cbb6e8b1340bb356b");
                    return;
                }
                com.meituan.android.yoda.monitor.log.a.a("YodaPageDataCallback", "createLocalYodaListener.onYodaResponse, requestCode:" + str + ",responseCode:" + str2, true);
                if (e.this.d != null) {
                    com.meituan.android.yoda.monitor.log.a.a("YodaPageDataCallback", "onSuccess, requestCode:" + str + ",responseCode:" + str2, true);
                    e.this.d.onSuccess(str, str2);
                }
                com.meituan.android.yoda.monitor.report.b.a("yoda_verify_callback", (int) Constants.MEDIA_ENGINE_AUDIO_EVENT_MIXING_PLAY, System.currentTimeMillis() - e.this.f, str);
                com.meituan.android.yoda.monitor.report.b.a("yoda_callback_code", System.currentTimeMillis() - e.this.f, e.this.g, str);
                e.this.e.b();
                com.meituan.android.yoda.model.behavior.tool.f.a().d();
            }

            @Override // com.meituan.android.yoda.IYodaVerifyListener
            public final void onCancel(String str) {
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e6933655dd7511c0d44f4b74010c0608", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e6933655dd7511c0d44f4b74010c0608");
                    return;
                }
                com.meituan.android.yoda.monitor.log.a.a("YodaPageDataCallback", "createLocalYodaListener.onCancel, requestCode:" + str, true);
                if (e.this.d != null) {
                    com.meituan.android.yoda.monitor.log.a.a("YodaPageDataCallback", "onCancel, requestCode:" + str, true);
                    e.this.d.onCancel(str);
                }
                com.meituan.android.yoda.monitor.report.b.a("yoda_verify_callback", (int) Constants.MEDIA_ENGINE_AUDIO_EVENT_MIXING_RESTART, System.currentTimeMillis() - e.this.f, str);
                com.meituan.android.yoda.monitor.report.b.a("yoda_callback_code", System.currentTimeMillis() - e.this.f, e.this.g, str);
                e.this.e.b();
                com.meituan.android.yoda.model.behavior.tool.f.a().d();
            }

            @Override // com.meituan.android.yoda.IYodaVerifyListener
            public final void onError(String str, Error error) {
                Object[] objArr3 = {str, error};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9dd3186c9068da7e7328a97cc2d3e831", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9dd3186c9068da7e7328a97cc2d3e831");
                    return;
                }
                com.meituan.android.yoda.monitor.log.a.a("YodaPageDataCallback", "createLocalYodaListener.onError, requestCode:" + str + ", error = " + error.toString(), true);
                if (e.this.d != null) {
                    if (com.meituan.android.yoda.config.a.a(error)) {
                        error.code = 121000;
                    }
                    com.meituan.android.yoda.monitor.log.a.a("YodaPageDataCallback", "onError, requestCode:" + str, true);
                    e.this.d.onError(str, error);
                }
                com.meituan.android.yoda.monitor.report.b.a("yoda_verify_callback", (int) Constants.MEDIA_ENGINE_AUDIO_EVENT_MIXING_PAUSED, System.currentTimeMillis() - e.this.f, str);
                com.meituan.android.yoda.monitor.report.b.a("yoda_callback_code", System.currentTimeMillis() - e.this.f, e.this.g, str);
                e.this.e.b();
                com.meituan.android.yoda.model.behavior.tool.f.a().d();
            }

            @Override // com.meituan.android.yoda.IYodaVerifyListener
            public final void onFaceVerifyTerminal(String str, Error error, com.meituan.android.yoda.model.a[] aVarArr, String str2) {
                Object[] objArr3 = {str, error, aVarArr, str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d5deaf9d642e8b486f0b44ae4ce7e2a8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d5deaf9d642e8b486f0b44ae4ce7e2a8");
                    return;
                }
                com.meituan.android.yoda.monitor.log.a.a("YodaPageDataCallback", "onFaceVerifyTerminal, requestCode:" + str + " FaceVerifyCallback:" + e.this.h, true);
                if (e.this.d != null && e.this.h) {
                    e.this.d.onFaceVerifyTerminal(str, error, aVarArr, str2);
                }
                e.this.e.b();
                com.meituan.android.yoda.model.behavior.tool.f.a().d();
            }
        };
    }

    @Override // com.meituan.android.yoda.callbacks.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d20a714cfda7132e7f68521b8d16105a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d20a714cfda7132e7f68521b8d16105a");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.b = str;
            if (TextUtils.isEmpty(this.g)) {
                this.g = str;
                this.f = System.currentTimeMillis();
            }
        }
    }

    @Override // com.meituan.android.yoda.interfaces.h
    public final void a(String str, @NonNull Error error) {
        Object[] objArr = {str, error};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec5037133f51e57b301da27a3e25c17d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec5037133f51e57b301da27a3e25c17d");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("YodaPageDataCallback", "onError, requestCode = " + str + ", error = " + error.toString(), true);
        if (this.l != null) {
            this.l.a(1);
        }
        if (com.meituan.android.yoda.config.a.a(error)) {
            x.a(this.e.a(), (int) R.string.yoda_error_net);
        } else {
            x.a(this.e.a(), error.message);
        }
        a(error);
    }

    @Override // com.meituan.android.yoda.callbacks.a
    public final FragmentActivity a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d99a7e1122f0c77886cf6c05dd9b5ce", RobustBitConfig.DEFAULT_VALUE) ? (FragmentActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d99a7e1122f0c77886cf6c05dd9b5ce") : this.e.a();
    }

    private boolean a(YodaResult yodaResult) {
        boolean z;
        Boolean bool;
        Object[] objArr = {yodaResult};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31b955d48f26ffb64c5adc6fe140d91a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31b955d48f26ffb64c5adc6fe140d91a")).booleanValue();
        }
        com.meituan.android.yoda.data.a aVar = new com.meituan.android.yoda.data.a();
        aVar.b = this;
        aVar.d = this.i;
        aVar.c = yodaResult;
        com.meituan.android.yoda.data.b.a(this.b, aVar);
        if (yodaResult.data != null) {
            if (yodaResult.data.containsKey("notifyUrl")) {
                String str = (String) yodaResult.data.get("notifyUrl");
                if (!TextUtils.isEmpty(str)) {
                    com.meituan.android.yoda.plugins.d.a().f = str;
                }
            }
            if (yodaResult.data.containsKey("isJumpToI") && (bool = (Boolean) yodaResult.data.get("isJumpToI")) != null && bool.booleanValue()) {
                a(2147483644);
                return true;
            }
        }
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7961f391e22de2b3ae1d4e906086b533", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7961f391e22de2b3ae1d4e906086b533")).booleanValue();
        } else {
            z = aVar.f.a() == 1 && com.meituan.android.yoda.config.a.d(aVar.f.a(0).get(0).intValue());
        }
        if (z) {
            b.a.a().a(this.e.a().getString(R.string.yoda_page_data_tips1), this, null);
            return false;
        }
        try {
            int intValue = aVar.f.a(0).get(0).intValue();
            if (this.m) {
                aVar.e = this.n;
                if (this.o < 0) {
                    intValue = aVar.f.a(this.n).get(0).intValue();
                } else {
                    intValue = this.o;
                }
            }
            a(intValue);
            return true;
        } catch (Exception e) {
            com.meituan.android.yoda.data.b.b(this.b);
            b.a.a().a("wtf", this, null);
            e.printStackTrace();
            com.meituan.android.yoda.monitor.log.a.a("YodaPageDataCallback", "handleYodaResult, requestCode = " + this.b + ", exception = " + e.getMessage(), true);
            return false;
        }
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c26f7fc6dac2a8de590083537d56fcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c26f7fc6dac2a8de590083537d56fcb");
        } else if (com.meituan.android.yoda.data.d.b(i)) {
            com.meituan.android.yoda.monitor.report.b.a("yoda_page_launch", 0L, i, this.b);
            com.meituan.android.yoda.data.a a = com.meituan.android.yoda.data.b.a(this.b);
            com.meituan.android.yoda.action.a.a(i, p.a(this.b, a != null ? a.e : 0, i, true)).a(this.j, this.b, this.e.a(), this.k, this.i, this.l, (com.meituan.android.yoda.config.verify.a) null);
        } else if (this.j == 0) {
            YodaConfirmActivity.a(this.e.a(), this.b, i);
        } else {
            b(i);
        }
    }

    @Deprecated
    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b117374d63b3d5d46400ff40710d8571", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b117374d63b3d5d46400ff40710d8571");
            return;
        }
        com.meituan.android.yoda.widget.tool.g a = com.meituan.android.yoda.widget.tool.g.a(this.b, this.e.a(), this.k);
        a.e = this.i;
        a.a(this.b, i, (Bundle) null);
    }

    private void a(Error error) {
        Object[] objArr = {error};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94316232f8c53cfc69670fb8da3654af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94316232f8c53cfc69670fb8da3654af");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("YodaPageDataCallback", "errorCallback, requestCode = " + this.b + ", error = " + error.toString(), true);
        if (this.i != null) {
            this.i.onError(this.b, error);
        }
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8ffd46fe52ce30a6552ab78c2add954", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8ffd46fe52ce30a6552ab78c2add954");
            return;
        }
        this.m = true;
        if (i < 0) {
            i = 0;
        }
        this.n = i;
        this.o = i2;
    }
}
