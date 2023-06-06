package com.meituan.android.common.aidata.feature.persona;

import android.text.TextUtils;
import com.meituan.android.common.aidata.AIData;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import rx.d;
import rx.j;
import rx.schedulers.a;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class UserCenterManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final List<LoginChangeListener> listeners;
    private UserProxy proxy;

    public UserCenterManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60fd94eac4bed4e9650162db084925ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60fd94eac4bed4e9650162db084925ba");
            return;
        }
        this.listeners = new ArrayList();
        init();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class InnerClass {
        private static final UserCenterManager STUB = new UserCenterManager();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static UserCenterManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6a091022e35d3a646344dece16ea8652", RobustBitConfig.DEFAULT_VALUE) ? (UserCenterManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6a091022e35d3a646344dece16ea8652") : InnerClass.STUB;
    }

    private void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0a5cd0c92911842945523101a180e75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0a5cd0c92911842945523101a180e75");
            return;
        }
        this.proxy = new UserProxy(UserCenter.getInstance(AIData.getContext()).getUser());
        d.a(new j<UserCenter.c>() { // from class: com.meituan.android.common.aidata.feature.persona.UserCenterManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // rx.e
            public void onCompleted() {
            }

            @Override // rx.e
            public void onError(Throwable th) {
            }

            @Override // rx.e
            public void onNext(UserCenter.c cVar) {
                Object[] objArr2 = {cVar};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8cf4b4dabe257c47caac0bd544d586f5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8cf4b4dabe257c47caac0bd544d586f5");
                } else if (cVar == null || UserCenterManager.this.listeners.size() <= 0) {
                } else {
                    if (cVar.b == UserCenter.d.login) {
                        UserCenterManager.this.userLogin(new UserProxy(cVar.c));
                    } else if (cVar.b == UserCenter.d.logout) {
                        UserCenterManager.this.userLogout();
                    }
                }
            }
        }, UserCenter.getInstance(AIData.getContext()).loginEventObservable().a(a.e()));
    }

    public boolean isUserLogin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bedc24611309f656777a15f1f8bfa267", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bedc24611309f656777a15f1f8bfa267")).booleanValue() : (this.proxy == null || TextUtils.isEmpty(this.proxy.token)) ? false : true;
    }

    public boolean isUserLogin(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58f7244633f7fa61bc861eb684f2caff", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58f7244633f7fa61bc861eb684f2caff")).booleanValue() : j != -1 && getUserId() == j;
    }

    public long getUserId() {
        if (this.proxy == null) {
            return -1L;
        }
        return this.proxy.id;
    }

    public String getToken() {
        return this.proxy == null ? "" : this.proxy.token;
    }

    public UserProxy getUserProxy() {
        return this.proxy;
    }

    public void addListener(LoginChangeListener loginChangeListener) {
        Object[] objArr = {loginChangeListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fc1641d88d942fa70fdd509b637986e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fc1641d88d942fa70fdd509b637986e");
        } else if (loginChangeListener == null) {
        } else {
            synchronized (this) {
                this.listeners.add(loginChangeListener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void userLogin(UserProxy userProxy) {
        Object[] objArr = {userProxy};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4bc1d907cdee2dc0bc107612a9791269", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4bc1d907cdee2dc0bc107612a9791269");
            return;
        }
        this.proxy = userProxy;
        for (LoginChangeListener loginChangeListener : this.listeners) {
            if (loginChangeListener != null) {
                loginChangeListener.onLogin(userProxy);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void userLogout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71df2f63950ed6ac469cd46b9ba924ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71df2f63950ed6ac469cd46b9ba924ae");
            return;
        }
        this.proxy = null;
        for (LoginChangeListener loginChangeListener : this.listeners) {
            if (loginChangeListener != null) {
                loginChangeListener.onLogout();
            }
        }
    }
}
