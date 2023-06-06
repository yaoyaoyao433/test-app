package com.meituan.android.yoda.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.dianping.titans.js.JsHandlerFactory;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.android.yoda.IYodaVerifyListener;
import com.meituan.android.yoda.YodaConfirm;
import com.meituan.android.yoda.callbacks.e;
import com.meituan.android.yoda.fragment.BaseFragment;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.android.yoda.util.o;
import com.meituan.android.yoda.util.q;
import com.meituan.android.yoda.util.w;
import com.meituan.android.yoda.util.x;
import com.meituan.android.yoda.util.y;
import com.meituan.android.yoda.widget.tool.g;
import com.meituan.android.yoda.widget.view.OtherConfirmButton;
import com.meituan.android.yoda.widget.view.YodaToolbar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.platform.utils.p;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class YodaConfirmActivity extends BaseActivity {
    public static ChangeQuickRedirect n = null;
    private static final String q = "YodaConfirmActivity";
    private YodaToolbar A;
    private JSONObject B;
    private CharSequence C;
    private Intent D;
    public int o;
    public int p;
    private Drawable r;
    private Drawable s;
    private Drawable t;
    private TextView u;
    private FrameLayout v;
    private int w;
    private b x;
    private PopupWindow y;
    private ViewGroup z;

    public YodaConfirmActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10ebec4e503598e8b0ad2f1f93804fd1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10ebec4e503598e8b0ad2f1f93804fd1");
            return;
        }
        this.r = new ColorDrawable(-1);
        this.s = new ColorDrawable(Color.parseColor("#FAFAFA"));
        this.t = new ColorDrawable(Color.parseColor("#00000000"));
        this.x = new b();
        this.o = 0;
        this.p = -1;
    }

    public static /* synthetic */ void a(YodaConfirmActivity yodaConfirmActivity, JSONObject jSONObject, com.meituan.android.yoda.model.a aVar, String str) {
        Object[] objArr = {jSONObject, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, yodaConfirmActivity, changeQuickRedirect, false, "98f7a23e1c9745e5583c16df791c088c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, yodaConfirmActivity, changeQuickRedirect, false, "98f7a23e1c9745e5583c16df791c088c");
        } else if (jSONObject == null || aVar == null) {
        } else {
            try {
                jSONObject.put("faceImage", str);
                jSONObject.put("faceRect", aVar.c.toString());
            } catch (Exception unused) {
            }
        }
    }

    public static /* synthetic */ void b(YodaConfirmActivity yodaConfirmActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, yodaConfirmActivity, changeQuickRedirect, false, "015e413c2fb7f7cd2b368a53fef664d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, yodaConfirmActivity, changeQuickRedirect, false, "015e413c2fb7f7cd2b368a53fef664d4");
        } else if (yodaConfirmActivity.f != null) {
            yodaConfirmActivity.f.a(yodaConfirmActivity.c, Integer.MAX_VALUE, (Bundle) null);
            if (yodaConfirmActivity.y == null || !yodaConfirmActivity.y.isShowing()) {
                return;
            }
            p.b(yodaConfirmActivity.y);
        }
    }

    public static /* synthetic */ void b(YodaConfirmActivity yodaConfirmActivity, View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, yodaConfirmActivity, changeQuickRedirect, false, "9d4282ac4babb870a6ae6c23f648bc68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, yodaConfirmActivity, changeQuickRedirect, false, "9d4282ac4babb870a6ae6c23f648bc68");
        } else if (yodaConfirmActivity.y == null || view == null) {
        } else {
            View findViewById = yodaConfirmActivity.y.getContentView().findViewById(R.id.yoda_pop_window_help);
            if (!yodaConfirmActivity.h()) {
                findViewById.setVisibility(8);
            } else {
                findViewById.setVisibility(0);
            }
            p.a(yodaConfirmActivity.y, view, 53, (int) x.a(15.0f), (int) x.a(88.0f));
        }
    }

    public static /* synthetic */ void d(YodaConfirmActivity yodaConfirmActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, yodaConfirmActivity, changeQuickRedirect, false, "60b246bf5c54843f26a0d812e732479c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, yodaConfirmActivity, changeQuickRedirect, false, "60b246bf5c54843f26a0d812e732479c");
            return;
        }
        List<Fragment> fragments = yodaConfirmActivity.getSupportFragmentManager().getFragments();
        if (fragments == null || fragments.isEmpty()) {
            return;
        }
        for (Fragment fragment : fragments) {
            if (fragment != null && fragment.isResumed() && (fragment instanceof BaseFragment)) {
                ((BaseFragment) fragment).i();
            }
        }
    }

    public static /* synthetic */ void f(YodaConfirmActivity yodaConfirmActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, yodaConfirmActivity, changeQuickRedirect, false, "9af7176a058f1aeae814523bf4514fce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, yodaConfirmActivity, changeQuickRedirect, false, "9af7176a058f1aeae814523bf4514fce");
        } else {
            yodaConfirmActivity.i.postDelayed(new Runnable() { // from class: com.meituan.android.yoda.activity.YodaConfirmActivity.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a0d111cca0cecb4990e6e605785e6d5e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a0d111cca0cecb4990e6e605785e6d5e");
                    } else {
                        YodaConfirmActivity.this.finish();
                    }
                }
            }, 500L);
        }
    }

    @Override // com.meituan.android.yoda.activity.BaseActivity, com.meituan.android.yoda.callbacks.c
    public final /* bridge */ /* synthetic */ com.meituan.android.yoda.interfaces.b a() {
        return super.a();
    }

    @Override // com.meituan.android.yoda.activity.BaseActivity, com.meituan.android.yoda.callbacks.c
    public final /* bridge */ /* synthetic */ void a(@NonNull com.meituan.android.yoda.interfaces.b bVar) {
        super.a(bVar);
    }

    @Override // com.meituan.android.yoda.activity.BaseActivity
    public final /* bridge */ /* synthetic */ void a(@NonNull com.meituan.android.yoda.interfaces.c cVar) {
        super.a(cVar);
    }

    @Override // com.meituan.android.yoda.activity.BaseActivity, com.meituan.android.yoda.interfaces.j
    public final /* bridge */ /* synthetic */ void a(String str) {
        super.a(str);
    }

    @Override // com.meituan.android.yoda.activity.BaseActivity, com.meituan.android.yoda.interfaces.j
    public final /* bridge */ /* synthetic */ void a(String str, int i, Bundle bundle) {
        super.a(str, i, bundle);
    }

    @Override // com.meituan.android.yoda.activity.BaseActivity, com.meituan.android.yoda.callbacks.c
    public final /* bridge */ /* synthetic */ com.meituan.android.yoda.interfaces.c b() {
        return super.b();
    }

    @Override // com.meituan.android.yoda.activity.BaseActivity
    public final /* bridge */ /* synthetic */ void b(@NonNull com.meituan.android.yoda.interfaces.c cVar) {
        super.b(cVar);
    }

    @Override // com.meituan.android.yoda.activity.BaseActivity, com.meituan.android.yoda.interfaces.j
    public final /* bridge */ /* synthetic */ void b(String str, int i, @Nullable Bundle bundle) {
        super.b(str, i, bundle);
    }

    @Override // com.meituan.android.yoda.activity.BaseActivity, com.meituan.android.yoda.callbacks.c
    public final /* bridge */ /* synthetic */ boolean b(@NonNull com.meituan.android.yoda.interfaces.b bVar) {
        return super.b(bVar);
    }

    @Override // com.meituan.android.yoda.activity.BaseActivity
    public final /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    @Override // com.meituan.android.yoda.activity.BaseActivity, android.app.Activity
    public final /* bridge */ /* synthetic */ void onRestoreInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        super.onRestoreInstanceState(bundle, persistableBundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class b extends com.meituan.android.yoda.plugins.c {
        public static ChangeQuickRedirect a;

        private b() {
            Object[] objArr = {YodaConfirmActivity.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79b65028c599edd9e39af1c7b322e1dd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79b65028c599edd9e39af1c7b322e1dd");
            }
        }

        @Override // com.meituan.android.yoda.plugins.c
        public final int getNetEnv() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f80732566d9960b4bd98b079070a008f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f80732566d9960b4bd98b079070a008f")).intValue() : YodaConfirmActivity.this.w;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a extends View.AccessibilityDelegate {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {YodaConfirmActivity.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0a88166a4d751a27053f0613b6ae450", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0a88166a4d751a27053f0613b6ae450");
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Object[] objArr = {view, accessibilityNodeInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2586c9fc291425a07db895b630d4a252", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2586c9fc291425a07db895b630d4a252");
                return;
            }
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setContentDescription(YodaConfirmActivity.this.getString(R.string.yoda_tool_bar_more_menu_voice_tips));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class d extends View.AccessibilityDelegate {
        public static ChangeQuickRedirect a;

        private d() {
            Object[] objArr = {YodaConfirmActivity.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c3ea8d93688e81dd51d7a8d7f79dbae", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c3ea8d93688e81dd51d7a8d7f79dbae");
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Object[] objArr = {view, accessibilityNodeInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "628b49f7eeef4b4ff9db3dde131ed788", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "628b49f7eeef4b4ff9db3dde131ed788");
                return;
            }
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setContentDescription(YodaConfirmActivity.this.getString(R.string.yoda_pop_menu_faq));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class c extends View.AccessibilityDelegate {
        public static ChangeQuickRedirect a;

        private c() {
            Object[] objArr = {YodaConfirmActivity.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c37f0a942a51ba88d8b1ce75a774b04b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c37f0a942a51ba88d8b1ce75a774b04b");
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Object[] objArr = {view, accessibilityNodeInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f3d5e17c3995b06208bef98147a48de", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f3d5e17c3995b06208bef98147a48de");
                return;
            }
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setContentDescription(YodaConfirmActivity.this.getString(R.string.yoda_pop_menu_change_verify_list));
        }
    }

    public static boolean a(Context context, String str, int i) {
        Object[] objArr = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48bb5640dcf5b1016e418d5eea3eea89", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48bb5640dcf5b1016e418d5eea3eea89")).booleanValue();
        }
        if (context == null) {
            String str2 = q;
            com.meituan.android.yoda.monitor.log.a.a(str2, "launch, context is null,return! requestCode = " + str, true);
            return false;
        } else if (TextUtils.isEmpty(str)) {
            q.b(q, "requestCode is empty,return!");
            com.meituan.android.yoda.monitor.log.a.a(q, "launch, requestCode is empty,return!", true);
            return false;
        } else {
            Log.e(q, "YodaConfirmActivity.launch");
            String str3 = q;
            com.meituan.android.yoda.monitor.log.a.a(str3, "launch, requestCode = " + str + ", type = " + i, true);
            Intent intent = new Intent(context, YodaConfirmActivity.class);
            intent.putExtra("first_type", i);
            intent.putExtra(OtherVerifyTypeConstants.REQUEST_CODE, str);
            context.startActivity(intent);
            return true;
        }
    }

    @Override // com.meituan.android.yoda.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ebd89fe223b51776aecba8cdfe7e95b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ebd89fe223b51776aecba8cdfe7e95b");
            return;
        }
        try {
            super.onCreate(bundle);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.D = getIntent();
        Uri data = this.D.getData();
        String str = StringUtil.NULL;
        if (data != null) {
            str = data.toString();
        }
        String str2 = q;
        com.meituan.android.yoda.monitor.log.a.a(str2, "onCreate, original intent = " + this.D.toString() + ", origin intent's uri = " + str + ", requestCode = " + f.a(this.D, OtherVerifyTypeConstants.REQUEST_CODE), true);
        k();
        if (o()) {
            return;
        }
        l();
        m();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a25b93c790c963c8d0aaa2ed047a7ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a25b93c790c963c8d0aaa2ed047a7ce");
            return;
        }
        Uri data = this.D.getData();
        String str = StringUtil.NULL;
        if (data != null) {
            str = data.toString();
        }
        String str2 = q;
        com.meituan.android.yoda.monitor.log.a.a(str2, "onNewIntent, original intent = " + intent.toString() + ", origin intent's uri = " + str, true);
        super.onNewIntent(intent);
        setIntent(intent);
        this.D = getIntent();
        Uri data2 = this.D.getData();
        String str3 = StringUtil.NULL;
        if (data2 != null) {
            str3 = data2.toString();
        }
        String str4 = q;
        com.meituan.android.yoda.monitor.log.a.a(str4, "onNewIntent, new intent = " + intent.toString() + ", new intent's uri = " + str3, true);
        k();
        if (o()) {
            return;
        }
        l();
        m();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public final void onBackPressed() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cb685798d2f0eae1f3b53dff25ad4ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cb685798d2f0eae1f3b53dff25ad4ee");
            return;
        }
        String str = q;
        com.meituan.android.yoda.monitor.log.a.a(str, "onBackPressed, requestCode = " + this.c, true);
        String c2 = com.meituan.android.yoda.config.ui.d.a().c();
        if (TextUtils.isEmpty(c2) && !TextUtils.isEmpty(this.C)) {
            c2 = this.C.toString();
        }
        b(c2);
        if (d()) {
            return;
        }
        try {
            if (this.f != null) {
                g gVar = this.f;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = g.a;
                if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "943802993e9be503f92625a1af613582", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "943802993e9be503f92625a1af613582")).booleanValue();
                } else {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = g.a;
                    if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "c460e7acb0ed5ec3e5ba2758e8864cb0", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "c460e7acb0ed5ec3e5ba2758e8864cb0")).booleanValue();
                    } else if (gVar.b == null || !gVar.b.b()) {
                        FragmentActivity fragmentActivity = gVar.c == null ? null : gVar.c.get();
                        if (!y.a((Activity) fragmentActivity)) {
                            o a2 = o.a();
                            Object[] objArr4 = {fragmentActivity};
                            ChangeQuickRedirect changeQuickRedirect4 = o.a;
                            z = PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "9686adb9ef3c5df2a29207b12828d9c4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "9686adb9ef3c5df2a29207b12828d9c4")).booleanValue() : o.a.b(fragmentActivity);
                        }
                    } else {
                        z = true;
                    }
                }
                if (z) {
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finish();
        try {
            if (this.e != null) {
                this.e.onCancel(this.c);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8b85825213c6c47384ebf7eb9f352dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8b85825213c6c47384ebf7eb9f352dc");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        a(i, i2, intent);
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // android.app.Activity
    public final void overridePendingTransition(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bed785cdce2b825eafa07d574a27a17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bed785cdce2b825eafa07d574a27a17");
        } else {
            super.overridePendingTransition(0, 0);
        }
    }

    @Override // com.meituan.android.yoda.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60c3231aea19d4d64da5ee68e5cd984e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60c3231aea19d4d64da5ee68e5cd984e");
            return;
        }
        String str = q;
        com.meituan.android.yoda.monitor.log.a.a(str, "onResume, requestCode = " + this.c, true);
        super.onResume();
    }

    @Override // com.meituan.android.yoda.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfc0b364fdcbd5ae66e8cf6a8f0d9771", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfc0b364fdcbd5ae66e8cf6a8f0d9771");
            return;
        }
        String str = q;
        com.meituan.android.yoda.monitor.log.a.a(str, "onPause, requestCode = " + this.c, true);
        overridePendingTransition(0, 0);
        super.onPause();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9180c9eaeb236b7ca4e92c500fa95ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9180c9eaeb236b7ca4e92c500fa95ba");
            return;
        }
        String str = q;
        com.meituan.android.yoda.monitor.log.a.a(str, "onPause, requestCode = " + this.c, true);
        super.onStop();
    }

    @Override // com.meituan.android.yoda.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c5c9bd46cf125b61c0c81ed6bacdcc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c5c9bd46cf125b61c0c81ed6bacdcc3");
            return;
        }
        String str = q;
        com.meituan.android.yoda.monitor.log.a.a(str, "onDestroy, requestCode = " + this.c, true);
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            y.b(currentFocus);
        }
        if (this.f != null) {
            g gVar = this.f;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = g.a;
            if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "6e53677cec8237e6452b6e848fc569f9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "6e53677cec8237e6452b6e848fc569f9");
            } else {
                if (gVar.b != null && gVar.b.a()) {
                    gVar.b.b();
                }
                gVar.e = null;
                gVar.f = null;
                gVar.c = null;
            }
        }
        super.onDestroy();
    }

    @Override // com.meituan.android.yoda.interfaces.c
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bca0867bdc8086e90a30dcd36bbf94e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bca0867bdc8086e90a30dcd36bbf94e6");
        } else if (com.meituan.android.yoda.config.ui.d.a().o() == null) {
            if (i == 2) {
                com.meituan.android.yoda.monitor.log.a.a(q, "setBackground, TRANSPARENT.", true);
                this.v.setBackground(this.t);
            } else if (i == 1) {
                com.meituan.android.yoda.monitor.log.a.a(q, "setBackground, GRAY.", true);
                this.v.setBackground(this.s);
            } else {
                com.meituan.android.yoda.monitor.log.a.a(q, "setBackground, WHITE.", true);
                this.v.setBackground(this.r);
            }
        }
    }

    @Override // com.meituan.android.yoda.interfaces.c
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1136ffad44b7c2646db56d268183c9f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1136ffad44b7c2646db56d268183c9f7");
        } else {
            onBackPressed();
        }
    }

    @Override // com.meituan.android.yoda.interfaces.c
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "151087e192db322f21ca76c70a38dd4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "151087e192db322f21ca76c70a38dd4c");
        } else if (this.A != null) {
            this.A.setTitle(str);
        }
    }

    @Override // com.meituan.android.yoda.interfaces.c
    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b37c09b47a2e289fcbabddf8fa6af4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b37c09b47a2e289fcbabddf8fa6af4f");
        } else if (this.A != null) {
            this.A.setVisibility(i);
        }
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "812f032652c6cfd0a772d4b83fe6704a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "812f032652c6cfd0a772d4b83fe6704a");
            return;
        }
        if (this.D != null) {
            this.c = f.a(this.D, OtherVerifyTypeConstants.REQUEST_CODE);
            this.g = com.meituan.android.yoda.data.b.a(this.c);
        }
        String str = q;
        com.meituan.android.yoda.monitor.log.a.a(str, "initData, requestCode = " + this.c, true);
        this.d = this.g == null ? null : this.g.d;
        this.e = a(this.d);
        this.v = (FrameLayout) findViewById(R.id.yoda_activity_rootView);
        g a2 = g.a(this.c, this, this.v.getId());
        a2.e = this.e;
        this.f = a2;
        if (this.D != null) {
            this.B = com.meituan.android.yoda.util.p.a(this.D.getData());
        }
    }

    private void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8008c97b5eaa060fc5194b15b7cca3d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8008c97b5eaa060fc5194b15b7cca3d3");
            return;
        }
        Drawable o = com.meituan.android.yoda.config.ui.d.a().o();
        if (o != null) {
            String str = q;
            com.meituan.android.yoda.monitor.log.a.a(str, "initBaseView, setBackground. requestCode = " + this.c, true);
            this.v.setBackground(o);
        }
        n();
        a(this.h);
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5880f74cd58c5e7d57f088eeab5e78e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5880f74cd58c5e7d57f088eeab5e78e");
            return;
        }
        e();
        a(this.g != null ? this.g.e : 0);
        if (this.D != null) {
            a(this.c, f.a(this.D, "first_type", 2147483646));
        }
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8abc4a3ab2b2ce1346117daaea37d37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8abc4a3ab2b2ce1346117daaea37d37");
            return;
        }
        this.A = (YodaToolbar) findViewById(R.id.yoda_statusBar_toolbar);
        this.A.setTitle("");
        this.u = (TextView) findViewById(R.id.yoda_toolbar_title);
        this.C = this.u.getText();
        this.h = (OtherConfirmButton) findViewById(R.id.btn_more);
        this.h.setVisibility(0);
        this.h.setAccessibilityDelegate(new a());
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.yoda.activity.YodaConfirmActivity.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8900b6915eaa6de00c3dd6120c8d6843", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8900b6915eaa6de00c3dd6120c8d6843");
                } else if (YodaConfirmActivity.this.f.d != Integer.MAX_VALUE) {
                    YodaConfirmActivity.b(YodaConfirmActivity.this, YodaConfirmActivity.this.h);
                }
            }
        });
        this.l = (TextView) findViewById(R.id.yoda_btn_change_verify);
        this.l.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.yoda.activity.YodaConfirmActivity.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "246254c8bc296ddded84a7e217ef2e0a", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "246254c8bc296ddded84a7e217ef2e0a");
                } else {
                    YodaConfirmActivity.b(YodaConfirmActivity.this);
                }
            }
        });
        this.A.q = new com.meituan.android.yoda.interfaces.d<TextView>() { // from class: com.meituan.android.yoda.activity.YodaConfirmActivity.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.yoda.interfaces.d
            public final String a() {
                return "";
            }

            @Override // com.meituan.android.yoda.interfaces.d
            public final int b() {
                return 0;
            }

            @Override // com.meituan.android.yoda.interfaces.d
            public final /* synthetic */ TextView c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb1fcc585b6c2885be20eb72d8e8d6b9", RobustBitConfig.DEFAULT_VALUE) ? (TextView) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb1fcc585b6c2885be20eb72d8e8d6b9") : YodaConfirmActivity.this.u;
            }
        };
        String c2 = com.meituan.android.yoda.config.ui.d.a().c();
        if (!TextUtils.isEmpty(c2)) {
            this.A.setTitle(c2);
            if (!com.meituan.android.yoda.config.ui.d.a().a()) {
                this.u.setTextColor(com.meituan.android.yoda.config.ui.d.a().h());
            }
            JSONObject d2 = com.meituan.android.yoda.config.ui.d.a().d();
            if (d2 != null) {
                if (d2.has("naviBarTitleColor")) {
                    try {
                        String string = d2.getString("naviBarTitleColor");
                        if (!string.startsWith("#")) {
                            string = "#" + string;
                        }
                        this.u.setTextColor(Color.parseColor(string));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if (d2.has("naviBarTitle")) {
                    try {
                        String string2 = d2.getString("naviBarTitle");
                        if (!TextUtils.isEmpty(string2)) {
                            this.u.setText(string2);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                if (d2.has("naviBarColor")) {
                    try {
                        String string3 = d2.getString("naviBarColor");
                        if (!string3.startsWith("#")) {
                            string3 = "#" + string3;
                        }
                        this.A.setBackgroundColor(Color.parseColor(string3));
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
            }
        }
        String e4 = com.meituan.android.yoda.config.ui.d.a().e();
        if (!TextUtils.isEmpty(e4)) {
            x.a(this, e4);
        }
        setSupportActionBar(this.A);
        if (getSupportActionBar() != null) {
            getSupportActionBar().a(true);
        }
        this.A.setNavigationContentDescription(x.a((int) R.string.yoda_verify_common_back_button));
        w.a(this, this.A).a().b();
        this.A.setNavigationOnClickListener(com.meituan.android.yoda.activity.a.a(this));
    }

    public static /* synthetic */ void a(YodaConfirmActivity yodaConfirmActivity, View view) {
        Object[] objArr = {yodaConfirmActivity, view};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "13f0e5274c5667ea3bb3407cb5213cde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "13f0e5274c5667ea3bb3407cb5213cde");
        } else {
            yodaConfirmActivity.onBackPressed();
        }
    }

    private IYodaVerifyListener a(final IYodaVerifyListener iYodaVerifyListener) {
        Object[] objArr = {iYodaVerifyListener};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce2aeab0ef411327745e97dbe4e7d246", RobustBitConfig.DEFAULT_VALUE)) {
            return (IYodaVerifyListener) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce2aeab0ef411327745e97dbe4e7d246");
        }
        if (iYodaVerifyListener == null) {
            return null;
        }
        return new IYodaVerifyListener() { // from class: com.meituan.android.yoda.activity.YodaConfirmActivity.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.yoda.IYodaVerifyListener
            public final void onSuccess(String str, String str2) {
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a76ac5e8b2404a671f3b4f346683ce73", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a76ac5e8b2404a671f3b4f346683ce73");
                    return;
                }
                YodaConfirmActivity.this.finish();
                try {
                    YodaConfirmActivity.this.f();
                    iYodaVerifyListener.onSuccess(str, str2);
                } catch (Exception unused) {
                }
            }

            @Override // com.meituan.android.yoda.IYodaVerifyListener
            public final void onCancel(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "246c4cb1d4391bfef884abfc2f7d7cb5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "246c4cb1d4391bfef884abfc2f7d7cb5");
                    return;
                }
                YodaConfirmActivity.this.finish();
                try {
                    YodaConfirmActivity.this.f();
                    iYodaVerifyListener.onCancel(str);
                } catch (Exception unused) {
                }
            }

            @Override // com.meituan.android.yoda.IYodaVerifyListener
            public final void onError(String str, Error error) {
                Object[] objArr2 = {str, error};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e50ba07b5e954738db3b5723fa4b0a7d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e50ba07b5e954738db3b5723fa4b0a7d");
                    return;
                }
                YodaConfirmActivity.this.finish();
                try {
                    YodaConfirmActivity.this.f();
                    iYodaVerifyListener.onError(str, error);
                } catch (Exception unused) {
                }
            }

            @Override // com.meituan.android.yoda.IYodaVerifyListener
            public final void onFaceVerifyTerminal(String str, Error error, com.meituan.android.yoda.model.a[] aVarArr, String str2) {
                Object[] objArr2 = {str, error, aVarArr, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "981ac38633aeb2ac8c146fe71d2536a1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "981ac38633aeb2ac8c146fe71d2536a1");
                    return;
                }
                try {
                    if (YodaConfirmActivity.this.g != null && (YodaConfirmActivity.this.g.b instanceof e)) {
                        if (YodaConfirmActivity.this.g()) {
                            ((e) YodaConfirmActivity.this.g.b).h = true;
                        } else {
                            ((e) YodaConfirmActivity.this.g.b).h = false;
                        }
                    }
                    iYodaVerifyListener.onFaceVerifyTerminal(str, error, aVarArr, str2);
                    YodaConfirmActivity.this.f();
                } catch (Exception unused) {
                }
                YodaConfirmActivity.this.finish();
            }
        };
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c652553d301aba2aed4759660082803", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c652553d301aba2aed4759660082803");
        } else if (this.z != null) {
            if (z) {
                this.z.setVisibility(0);
            } else {
                this.z.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(android.view.View r12) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.yoda.activity.YodaConfirmActivity.a(android.view.View):void");
    }

    private boolean o() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eceb0acda3eea3b6854e2fb9dbde588f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eceb0acda3eea3b6854e2fb9dbde588f")).booleanValue();
        }
        String str = null;
        Uri data = this.D != null ? this.D.getData() : null;
        if (data != null && !TextUtils.isEmpty(data.toString())) {
            try {
                this.o = Integer.parseInt(data.getQueryParameter("listIndex"));
            } catch (Exception unused) {
                this.o = 0;
            }
            try {
                this.p = Integer.parseInt(data.getQueryParameter("next"));
            } catch (Exception unused2) {
                this.p = -1;
            }
            try {
                int parseInt = Integer.parseInt(data.getQueryParameter("env"));
                if (parseInt == 0) {
                    parseInt = 1;
                }
                i = parseInt;
            } catch (Exception e) {
                e.printStackTrace();
                i = 1;
            }
            String queryParameter = data.getQueryParameter("action");
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = "yoda_default_callback";
            }
            final String queryParameter2 = data.getQueryParameter(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY);
            final JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("action", queryParameter);
                jSONObject.put(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, queryParameter2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                try {
                    this.w = i;
                    String str2 = q;
                    com.meituan.android.yoda.monitor.log.a.a(str2, "handleWebCall, requestCode = " + queryParameter2 + ", env = " + i, true);
                    com.meituan.android.yoda.plugins.d.a().a(this.x);
                    com.meituan.android.yoda.plugins.d.a().c();
                    YodaConfirm yodaConfirm = YodaConfirm.getInstance(this, new IYodaVerifyListener() { // from class: com.meituan.android.yoda.activity.YodaConfirmActivity.9
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.yoda.IYodaVerifyListener
                        public final void onSuccess(String str3, String str4) {
                            Object[] objArr2 = {str3, str4};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "faa6622b2cc05135efd99027e7a58915", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "faa6622b2cc05135efd99027e7a58915");
                                return;
                            }
                            try {
                                if (!TextUtils.isEmpty(str3) && !str3.equalsIgnoreCase(queryParameter2)) {
                                    jSONObject.remove(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY);
                                    jSONObject.put(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, str3);
                                }
                                jSONObject.put(OtherVerifyTypeConstants.RESPONSE_CODE_IDENTITY, str4);
                                jSONObject.put("code", 0);
                                jSONObject.put("message", "success");
                                String str5 = YodaConfirmActivity.q;
                                com.meituan.android.yoda.monitor.log.a.a(str5, "JsHandlerFactory.publish, yodaResult = " + jSONObject.toString(), true);
                                JsHandlerFactory.publish(jSONObject);
                                YodaConfirmActivity.f(YodaConfirmActivity.this);
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                        }

                        @Override // com.meituan.android.yoda.IYodaVerifyListener
                        public final void onCancel(String str3) {
                            Object[] objArr2 = {str3};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c9cc53453016880f3fd08c3b987b067f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c9cc53453016880f3fd08c3b987b067f");
                                return;
                            }
                            try {
                                if (!TextUtils.isEmpty(str3) && !str3.equalsIgnoreCase(queryParameter2)) {
                                    jSONObject.remove(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY);
                                    jSONObject.put(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, str3);
                                }
                                jSONObject.put("code", 1);
                                jSONObject.put("message", "cancel");
                                String str4 = YodaConfirmActivity.q;
                                com.meituan.android.yoda.monitor.log.a.a(str4, "JsHandlerFactory.publish, yodaResult = " + jSONObject.toString(), true);
                                JsHandlerFactory.publish(jSONObject);
                                YodaConfirmActivity.f(YodaConfirmActivity.this);
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                        }

                        @Override // com.meituan.android.yoda.IYodaVerifyListener
                        public final void onError(String str3, Error error) {
                            Object[] objArr2 = {str3, error};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "13ab23493ed4f0ae86e20da6ba95fed5", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "13ab23493ed4f0ae86e20da6ba95fed5");
                                return;
                            }
                            try {
                                if (!TextUtils.isEmpty(str3) && !str3.equalsIgnoreCase(queryParameter2)) {
                                    jSONObject.remove(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY);
                                    jSONObject.put(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, str3);
                                }
                                jSONObject.put("code", 2);
                                jSONObject.put("errorCode", error.code);
                                jSONObject.put("message", error.message);
                                String str4 = YodaConfirmActivity.q;
                                com.meituan.android.yoda.monitor.log.a.a(str4, "JsHandlerFactory.publish, yodaResult = " + jSONObject.toString(), true);
                                JsHandlerFactory.publish(jSONObject);
                                YodaConfirmActivity.f(YodaConfirmActivity.this);
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                        }

                        @Override // com.meituan.android.yoda.IYodaVerifyListener
                        public final void onFaceVerifyTerminal(String str3, Error error, com.meituan.android.yoda.model.a[] aVarArr, String str4) {
                            Object[] objArr2 = {str3, error, aVarArr, str4};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b19af4132cdc2cea3dc061e7ded999d9", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b19af4132cdc2cea3dc061e7ded999d9");
                                return;
                            }
                            try {
                                if (!TextUtils.isEmpty(str3) && !str3.equalsIgnoreCase(queryParameter2)) {
                                    jSONObject.remove(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY);
                                    jSONObject.put(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, str3);
                                }
                                jSONObject.put("code", 3);
                                jSONObject.put("errorCode", error.code);
                                jSONObject.put("message", error.message);
                                if (aVarArr != null && aVarArr.length > 0) {
                                    YodaConfirmActivity.a(YodaConfirmActivity.this, jSONObject, aVarArr[0], str4);
                                }
                                String str5 = YodaConfirmActivity.q;
                                com.meituan.android.yoda.monitor.log.a.a(str5, "JsHandlerFactory.publish, yodaResult = " + jSONObject.toString(), true);
                                JsHandlerFactory.publish(jSONObject);
                                YodaConfirmActivity.f(YodaConfirmActivity.this);
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                        }
                    });
                    if (this.B != null && this.B.has("naviBarTitle")) {
                        str = this.B.getString("naviBarTitle");
                    }
                    int i2 = this.B.getInt("faceCollectShadeMode");
                    int i3 = this.B.getInt("faceAuthTimeOutPeriod");
                    int i4 = this.B.getInt("faceAuthAlwaysTryAgain");
                    int i5 = this.B.getInt("faceVoiceBroadcastMode");
                    com.meituan.android.yoda.d a2 = com.meituan.android.yoda.d.a().a(this.B);
                    a2.c = str;
                    Object[] objArr2 = {Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.yoda.d.a;
                    if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "45040a80413e05530579f8cc10cf0bbe", RobustBitConfig.DEFAULT_VALUE)) {
                        a2 = (com.meituan.android.yoda.d) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "45040a80413e05530579f8cc10cf0bbe");
                    } else {
                        com.meituan.android.yoda.monitor.log.a.a("YodaUIConfig", "setFaceMaskMode, mode = " + i2, true);
                        a2.e = i2;
                    }
                    YodaConfirm registerBusinessUIConfig = yodaConfirm.registerBusinessUIConfig(a2);
                    com.meituan.android.yoda.e a3 = com.meituan.android.yoda.e.a();
                    a3.c = i3;
                    a3.d = i4 == 1;
                    a3.b = i5;
                    registerBusinessUIConfig.registerVerifyStrategyConfig(a3).startConfirm(queryParameter2);
                    return true;
                } catch (Exception e3) {
                    e3.printStackTrace();
                    try {
                        jSONObject.put("code", 2);
                        jSONObject.put("message", e3.toString());
                        JsHandlerFactory.publish(jSONObject);
                    } catch (Exception unused3) {
                        e3.printStackTrace();
                    }
                    String str3 = q;
                    com.meituan.android.yoda.monitor.log.a.a(str3, "handleWebCall, start confirm error = " + e3.toString(), true);
                    return false;
                }
            }
        }
        return false;
    }
}
