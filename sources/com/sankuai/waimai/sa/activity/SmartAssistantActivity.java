package com.sankuai.waimai.sa.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.sa.ui.assistant.b;
import com.sankuai.waimai.sa.ui.assistant.d;
import com.sankuai.waimai.sa.ui.assistant.voice.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SmartAssistantActivity extends BaseActivity {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    private d c;

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        View view;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47aa6d62392e01dab2245fb62a56ac55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47aa6d62392e01dab2245fb62a56ac55");
            return;
        }
        b = true;
        super.onCreate(bundle);
        String w = w();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        this.c = new d(this, w, PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "93ed1522a0c05275989a0d10324c2470", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "93ed1522a0c05275989a0d10324c2470") : new com.sankuai.waimai.sa.voice.a(this));
        Intent intent = getIntent();
        if (intent != null) {
            int a2 = f.a(intent, "sa_scheme_channel", 0);
            if (a2 == 0 || a2 == 2) {
                d dVar = this.c;
                int a3 = f.a(intent, "mSASceneType", 1);
                String a4 = f.a(intent, "mSASceneLabel");
                String a5 = f.a(intent, "mSASceneMsg");
                dVar.g = a3;
                dVar.h = a4;
                dVar.i = a5;
            } else if (a2 == 1) {
                this.c.f = f.a(intent, "sa_init_ask_msg");
            }
            this.c.e = a2;
        }
        d dVar2 = this.c;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = d.a;
        if (PatchProxy.isSupport(objArr3, dVar2, changeQuickRedirect3, false, "1856640910b252c516bfa40ddfe136fb", RobustBitConfig.DEFAULT_VALUE)) {
            view = (View) PatchProxy.accessDispatch(objArr3, dVar2, changeQuickRedirect3, false, "1856640910b252c516bfa40ddfe136fb");
        } else {
            dVar2.d = LayoutInflater.from(dVar2.b).inflate(R.layout.wm_smart_assistant_layout_new, (ViewGroup) null);
            dVar2.d.setOnClickListener(dVar2);
            view = dVar2.d;
        }
        setContentView(view);
        this.c.c = new a(bB_(), bB_());
        this.c.onActivityCreated(this, bundle);
        this.c.a(b.a.CHAT);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19bbc61d798ebbf10b39179e74e187ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19bbc61d798ebbf10b39179e74e187ca");
            return;
        }
        super.onStart();
        this.c.onActivityStarted(this);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53d5267cc063503df569af9e1218b943", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53d5267cc063503df569af9e1218b943");
            return;
        }
        super.onBackPressed();
        overridePendingTransition(R.anim.wm_common_dialog_alpha_in, R.anim.wm_common_popup_window_slide_out);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeb09cb9f6d093c470999f9aa529a466", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeb09cb9f6d093c470999f9aa529a466");
            return;
        }
        JudasManualManager.a("c_6tg6wz4r", this);
        super.onResume();
        this.c.onActivityResumed(this);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15548f8d741885027736f4116aba34e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15548f8d741885027736f4116aba34e6");
            return;
        }
        super.onPause();
        this.c.onActivityPaused(this);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39c0cf88e01de9ee4319399e1a5d4064", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39c0cf88e01de9ee4319399e1a5d4064");
            return;
        }
        super.onStop();
        this.c.onActivityStopped(this);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca5caad29a4d38ee5f45a83068d07a6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca5caad29a4d38ee5f45a83068d07a6c");
            return;
        }
        b = false;
        super.onDestroy();
        this.c.onActivityDestroyed(this);
    }
}
