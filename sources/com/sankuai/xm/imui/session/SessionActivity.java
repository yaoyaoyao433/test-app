package com.sankuai.xm.imui.session;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.xm.base.util.ActivityUtils;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.base.BaseActivity;
import com.sankuai.xm.imui.session.entity.SessionParams;
import com.sankuai.xm.imui.session.event.e;
import com.sankuai.xm.integration.crypto.CryptoProxy;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class SessionActivity extends BaseActivity {
    public static ChangeQuickRedirect c;
    private static WeakReference<? extends Activity> e;
    public SessionFragment d;
    private SessionId f;
    private String g;
    private SessionParams h;

    @Override // com.sankuai.xm.imui.base.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        SessionProvider a;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75acb629348b43cb5f81bd101f73c72f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75acb629348b43cb5f81bd101f73c72f");
            return;
        }
        super.onCreate(bundle);
        a(this);
        setContentView(R.layout.xm_sdk_activity_session);
        Intent intent = getIntent();
        Object[] objArr2 = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2c45da67c6b94319f7b14b8c5f965e2f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2c45da67c6b94319f7b14b8c5f965e2f");
        } else if (isFinishing()) {
            com.sankuai.xm.imui.common.util.d.d("SessionActivity::init:: activity is finishing.", new Object[0]);
        } else {
            if (intent != null) {
                try {
                    this.f = (SessionId) intent.getParcelableExtra("SessionId");
                    this.g = f.a(intent, "ActivityId");
                    this.h = (SessionParams) intent.getParcelableExtra("SessionParams");
                } catch (Throwable th) {
                    com.sankuai.xm.imui.common.util.d.a(th, "SessionActivity::init:: intent read error.", new Object[0]);
                    this.h = com.sankuai.xm.imui.b.a().c();
                }
            }
            if (this.f == null) {
                com.sankuai.xm.imui.common.util.d.d("SessionActivity::onCreate::failed in getting session id from intent, extra = %s", (intent == null || intent.getExtras() == null) ? StringUtil.NULL : intent.getExtras().toString());
                this.f = com.sankuai.xm.imui.b.a().f();
                this.g = com.sankuai.xm.imui.b.a().h();
                this.h = com.sankuai.xm.imui.b.a().c();
            }
            CryptoProxy.c().b();
            this.d = (SessionFragment) getSupportFragmentManager().findFragmentById(R.id.xm_sdk_session);
            if (this.d == null && (a = IMUIManager.a().a(this.g)) != null) {
                this.d = a.createSessionFragment();
            }
            if (this.d == null) {
                this.d = new SessionFragment();
            }
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("SessionId", this.f);
            bundle2.putString("ActivityId", this.g);
            bundle2.putParcelable("SessionParams", this.h);
            this.d.setArguments(bundle2);
            this.d.u = new com.sankuai.xm.imui.session.presenter.b(this.d);
            getSupportFragmentManager().beginTransaction().replace(R.id.xm_sdk_session, this.d).commitNow();
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7899284c86576ebc8c69565f3718b8a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7899284c86576ebc8c69565f3718b8a");
            return;
        }
        super.onStart();
        if (this.d != null) {
            this.b = this.d.v;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = BaseActivity.a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "207b6264333456c4c5bbf65ba836afa2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "207b6264333456c4c5bbf65ba836afa2");
            return;
        }
        com.sankuai.xm.imui.theme.c a = com.sankuai.xm.imui.theme.c.a();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = BaseActivity.a;
        com.sankuai.xm.imui.theme.b a2 = a.a(PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ef20febaa9bafa307154ff1e085c4f81", 6917529027641081856L) ? ((Short) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ef20febaa9bafa307154ff1e085c4f81")).shortValue() : com.sankuai.xm.imui.b.a().f().g);
        if (a2 != null) {
            a(a2);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5debf18850af48d34bea6d91aa3532d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5debf18850af48d34bea6d91aa3532d");
            return;
        }
        if (this.d != null) {
            if (this.d.r != null && this.d.r.e()) {
                this.d.r.a(e.f.a(false, null));
                return;
            } else if (this.d.v != null && this.d.v.a()) {
                this.d.v.b();
                return;
            }
        }
        onStateNotSaved();
        try {
            super.onBackPressed();
        } catch (Exception e2) {
            com.sankuai.xm.imui.common.util.d.a(e2);
        }
    }

    @Override // com.sankuai.xm.imui.base.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a00ad9b60dc00cdb0388ba4f65673ee5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a00ad9b60dc00cdb0388ba4f65673ee5");
            return;
        }
        super.onDestroy();
        IMUIManager.a().a(this.g, (SessionProvider) null);
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1df9ff0b604b5c2c1900777b982d3fc0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1df9ff0b604b5c2c1900777b982d3fc0");
        } else if (e != null && this == e.get()) {
            if (!isFinishing()) {
                finish();
            }
            e = null;
        }
        CryptoProxy.c().b();
    }

    @Override // com.sankuai.xm.imui.base.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0cf5b0b65af5293c67246739bbc0df5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0cf5b0b65af5293c67246739bbc0df5");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        if (this.d != null && this.d.r != null && i >= 0 && i <= 255) {
            this.d.r.a(com.sankuai.xm.imui.session.event.a.a(i, i2, intent));
        }
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // com.sankuai.xm.imui.base.BaseActivity, com.sankuai.xm.imui.theme.c.a
    public final void a(com.sankuai.xm.imui.theme.b bVar) {
        View childAt;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5150b8924ef976c5b8056a1ce7f29935", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5150b8924ef976c5b8056a1ce7f29935");
        } else if (ActivityUtils.a((Activity) this)) {
            if (this.d != null) {
                this.d.a(bVar);
            }
            com.sankuai.xm.imui.theme.c.a(bVar.b, this);
            Integer num = bVar.c;
            Integer num2 = bVar.d;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = BaseActivity.a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c3568a825823f6c833a741419b92060", 6917529027641081856L)) {
                childAt = (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c3568a825823f6c833a741419b92060");
            } else {
                ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
                childAt = viewGroup == null ? null : viewGroup.getChildAt(0);
            }
            com.sankuai.xm.imui.theme.c.a(num, num2, childAt);
        }
    }

    public static void a(Activity activity) {
        Activity activity2;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2d905193b6648aea169d7412adc2bc1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2d905193b6648aea169d7412adc2bc1");
            return;
        }
        if (e != null && (activity2 = e.get()) != null) {
            activity2.finish();
        }
        if (activity != null) {
            e = new WeakReference<>(activity);
        }
    }
}
