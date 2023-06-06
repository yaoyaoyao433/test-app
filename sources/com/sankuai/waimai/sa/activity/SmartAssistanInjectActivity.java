package com.sankuai.waimai.sa.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.constraint.R;
import com.meituan.ai.speech.base.log.LingxiBaseReport;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.router.interfaces.c;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SmartAssistanInjectActivity extends Activity {
    public static ChangeQuickRedirect a;
    private Bundle b;
    private int c;
    private String d;

    public SmartAssistanInjectActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4dd17fde470e4586cbce737a6231223", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4dd17fde470e4586cbce737a6231223");
            return;
        }
        this.b = new Bundle();
        this.c = 0;
        this.d = null;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5175bd40bfe5a793fe68c389890080ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5175bd40bfe5a793fe68c389890080ec");
            return;
        }
        super.onCreate(bundle);
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72ca1a2d3b5aba8c7fb3972e3299b3cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "72ca1a2d3b5aba8c7fb3972e3299b3cf");
        } else if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        Intent intent = getIntent();
        if (intent != null) {
            if (intent.getData() != null && intent.getData().getQueryParameter("label") != null) {
                if (SmartAssistantActivity.b) {
                    finish();
                    return;
                } else if (!com.sankuai.waimai.platform.capacity.persistent.sp.a.b(b.a, "smart_assistant_is_show_entrance", false)) {
                    finish();
                    return;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("fragment_id", 0);
                    bundle2.putBoolean("arg_need_open_smart_assistant", true);
                    bundle2.putString("arg_smart_assistant_label", intent.getData().getQueryParameter("label"));
                    com.sankuai.waimai.foundation.router.a.a(this, c.B, bundle2);
                    finish();
                    return;
                }
            } else if (intent.getScheme() != null) {
                if (intent.getScheme().equals("meituanwaimai") || (intent.getScheme().equals("imeituan") && intent.getDataString().contains(LingxiBaseReport.SPEECH_SDK_LING_XI_CATEGORY))) {
                    this.c = 1;
                    this.d = f.b(intent, (String) null, "msg");
                }
                this.b.putInt("sa_scheme_channel", this.c);
                this.b.putString("sa_init_ask_msg", this.d);
            }
        }
        com.sankuai.waimai.platform.domain.manager.user.a.a(this, new Runnable() { // from class: com.sankuai.waimai.sa.activity.SmartAssistanInjectActivity.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bdbbdec76d62055a1de0794e0e27fbe2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bdbbdec76d62055a1de0794e0e27fbe2");
                    return;
                }
                SmartAssistanInjectActivity.this.overridePendingTransition(R.anim.wm_common_popup_window_slide_in, R.anim.wm_page_fading_out);
                com.sankuai.waimai.foundation.router.a.a(SmartAssistanInjectActivity.this, c.F, SmartAssistanInjectActivity.this.b);
                SmartAssistanInjectActivity.this.overridePendingTransition(R.anim.wm_common_popup_window_slide_in, R.anim.wm_page_fading_out);
            }
        });
        finish();
    }
}
