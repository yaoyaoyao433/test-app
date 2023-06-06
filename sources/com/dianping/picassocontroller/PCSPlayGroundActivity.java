package com.dianping.picassocontroller;

import android.app.Dialog;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.dianping.picasso.PicassoInput;
import com.dianping.picasso.PicassoManager;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picasso.PicassoView;
import com.dianping.picasso.view.keyboard.PicassoKeyboardCenter;
import com.dianping.picassocontroller.debug.g;
import com.dianping.picassocontroller.debug.j;
import com.dianping.picassocontroller.jse.c;
import com.dianping.picassocontroller.jse.f;
import com.dianping.picassocontroller.vc.PicassoBaseActivity;
import com.dianping.picassocontroller.vc.d;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PCSPlayGroundActivity extends PicassoBaseActivity {
    public static ChangeQuickRedirect a;
    private boolean d;
    private PicassoView e;
    private PicassoView f;
    private Button g;
    private FrameLayout h;
    private Dialog i;
    private d.a j;

    public PCSPlayGroundActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1645303abc665331871e1b26433315ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1645303abc665331871e1b26433315ab");
        } else {
            this.d = true;
        }
    }

    public static /* synthetic */ void f(PCSPlayGroundActivity pCSPlayGroundActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, pCSPlayGroundActivity, changeQuickRedirect, false, "50fcc82086dae9e91a5320f6f3c29b97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, pCSPlayGroundActivity, changeQuickRedirect, false, "50fcc82086dae9e91a5320f6f3c29b97");
            return;
        }
        pCSPlayGroundActivity.getWindow().setFlags(16, 16);
        pCSPlayGroundActivity.i.show();
    }

    @Override // com.dianping.picassocontroller.vc.PicassoBaseActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4d13102e5d4c61d98061705d80a1d1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4d13102e5d4c61d98061705d80a1d1a");
            return;
        }
        super.onCreate(bundle);
        String a2 = a("IntentData");
        Object[] objArr2 = {a2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "244c5a2a76671cb2f80072e4ed1f69d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "244c5a2a76671cb2f80072e4ed1f69d6");
        } else {
            if (!TextUtils.isEmpty(a2)) {
                try {
                    a("'use strict';\nvar _dp_picasso = require('@dp/picasso');\nvar extendStatics = Object.setPrototypeOf ||\n    ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||\n    function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };\nfunction __extends(d, b) {\n    extendStatics(d, b);\n    function __() { this.constructor = d; }\n    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());\n}\nvar HelloPicasso = /** @class */ (function (_super) {\n    __extends(HelloPicasso, _super);\n    function HelloPicasso() {\n        return _super !== null && _super.apply(this, arguments) || this;\n    }\n    HelloPicasso.prototype.layout = function () {\n        var bg = _dp_picasso.View.viewWithFrame(0, 0, this.width, this.height);\n        var tv = new _dp_picasso.TextView;\n        tv.text = \"\\u6B22\\u8FCE\\u4F7F\\u7528Picasso\\u8C03\\u8BD5\\u9875\\u9762\\n\\u8BF7\\u4FEE\\u6539\\u76EE\\u6807\\u6587\\u4EF6\\u4EE5\\u4F7FLiveLoad\\u751F\\u6548\\n        \";\n        tv.textSize = 20;\n        tv.width = bg.width;\n        tv.numberOfLines = 0;\n        tv.sizeToFit();\n        //tv.top = 20\n        tv.centerX = this.width / 2;\n        tv.centerY = this.height / 2;\n        bg.addSubView(tv);\n        return bg;\n    };\n    return HelloPicasso;\n}(_dp_picasso.VC));\nPicasso.Page(HelloPicasso);\n", new JSONObject(a2));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                this.f = (PicassoView) findViewById(R.id.picasso_view);
            }
            a("'use strict';\nvar _dp_picasso = require('@dp/picasso');\nvar extendStatics = Object.setPrototypeOf ||\n    ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||\n    function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };\nfunction __extends(d, b) {\n    extendStatics(d, b);\n    function __() { this.constructor = d; }\n    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());\n}\nvar HelloPicasso = /** @class */ (function (_super) {\n    __extends(HelloPicasso, _super);\n    function HelloPicasso() {\n        return _super !== null && _super.apply(this, arguments) || this;\n    }\n    HelloPicasso.prototype.layout = function () {\n        var bg = _dp_picasso.View.viewWithFrame(0, 0, this.width, this.height);\n        var tv = new _dp_picasso.TextView;\n        tv.text = \"\\u6B22\\u8FCE\\u4F7F\\u7528Picasso\\u8C03\\u8BD5\\u9875\\u9762\\n\\u8BF7\\u4FEE\\u6539\\u76EE\\u6807\\u6587\\u4EF6\\u4EE5\\u4F7FLiveLoad\\u751F\\u6548\\n        \";\n        tv.textSize = 20;\n        tv.width = bg.width;\n        tv.numberOfLines = 0;\n        tv.sizeToFit();\n        //tv.top = 20\n        tv.centerX = this.width / 2;\n        tv.centerY = this.height / 2;\n        bg.addSubView(tv);\n        return bg;\n    };\n    return HelloPicasso;\n}(_dp_picasso.VC));\nPicasso.Page(HelloPicasso);\n", (JSONObject) null);
            this.f = (PicassoView) findViewById(R.id.picasso_view);
        }
        this.h = (FrameLayout) findViewById(R.id.root);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0ea2a0759596de9e38d7ed0e1e3cbffe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0ea2a0759596de9e38d7ed0e1e3cbffe");
        } else {
            PicassoManager.startDebugServiceDomain(null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = PicassoUtils.dp2px(this, 44.0f);
            final PicassoInput picassoInput = new PicassoInput();
            this.e = new PicassoView(this) { // from class: com.dianping.picassocontroller.PCSPlayGroundActivity.2
                public static ChangeQuickRedirect a;

                @Override // com.dianping.picasso.PicassoView, android.view.View
                public final void onSizeChanged(int i, int i2, int i3, int i4) {
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "dc0f89c5864e9b92ab78abac3b4dcf80", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "dc0f89c5864e9b92ab78abac3b4dcf80");
                        return;
                    }
                    super.onSizeChanged(i, i2, i3, i4);
                    picassoInput.width = (int) PicassoUtils.px2dp(getContext(), i);
                    picassoInput.height = (int) PicassoUtils.px2dp(getContext(), i2);
                }
            };
            this.e.setLayoutParams(layoutParams);
            this.e.setPicassoInput(picassoInput);
            picassoInput.name = "picasso_playground";
            picassoInput.jsonData = "{}";
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "904a85272b5d2f2849e977029bf5354e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "904a85272b5d2f2849e977029bf5354e");
        } else {
            final Button button = new Button(this);
            button.setBackgroundColor(-3355444);
            button.setText("VC Mode");
            ((ViewGroup) getWindow().getDecorView()).addView(button);
            button.getLayoutParams().width = PicassoUtils.dp2px(this, 120.0f);
            button.getLayoutParams().height = PicassoUtils.dp2px(this, 40.0f);
            Point point = new Point();
            getWindowManager().getDefaultDisplay().getSize(point);
            ((ViewGroup.MarginLayoutParams) button.getLayoutParams()).leftMargin = (point.x - button.getLayoutParams().width) - 20;
            ((ViewGroup.MarginLayoutParams) button.getLayoutParams()).topMargin = (point.y - button.getLayoutParams().height) - 20;
            button.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.picassocontroller.PCSPlayGroundActivity.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr5 = {view};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "5831e7a9a8d639b14d9d776a27ff9a44", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "5831e7a9a8d639b14d9d776a27ff9a44");
                    } else if (g.e.equals(g.a.DEBUG_OFF)) {
                        PCSPlayGroundActivity.this.h.removeView(PCSPlayGroundActivity.this.e);
                        PCSPlayGroundActivity.this.h.removeView(PCSPlayGroundActivity.this.f);
                        if (PCSPlayGroundActivity.this.d) {
                            PCSPlayGroundActivity.this.h.addView(PCSPlayGroundActivity.this.e);
                            button.setText("View Mode");
                        } else {
                            PCSPlayGroundActivity.this.h.addView(PCSPlayGroundActivity.this.f);
                            button.setText("VC Mode");
                        }
                        PCSPlayGroundActivity.this.d = true ^ PCSPlayGroundActivity.this.d;
                    } else {
                        com.sankuai.meituan.android.ui.widget.a.a(PCSPlayGroundActivity.this, "Debug 功能正在运行，无法进行切换", 0).a();
                    }
                }
            });
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "fe8caa72cb4d98164ed18d8025e749bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "fe8caa72cb4d98164ed18d8025e749bf");
        } else {
            this.g = new Button(this);
            this.g.setTextColor(-1);
            switch (g.e) {
                case DEBUG_OFF:
                    this.g.setBackgroundColor(-3355444);
                    this.g.setText("Debug Off");
                    break;
                case DEBUG_CONNECTING:
                    this.g.setBackgroundColor(-22746);
                    this.g.setText("Connecting...");
                    break;
                case DEBUG_ON:
                    this.g.setBackgroundColor(-12409355);
                    this.g.setText("Debug On");
                    break;
            }
            ((ViewGroup) getWindow().getDecorView()).addView(this.g);
            this.g.getLayoutParams().width = PicassoUtils.dp2px(this, 120.0f);
            this.g.getLayoutParams().height = PicassoUtils.dp2px(this, 40.0f);
            Point point2 = new Point();
            getWindowManager().getDefaultDisplay().getSize(point2);
            ((ViewGroup.MarginLayoutParams) this.g.getLayoutParams()).leftMargin = (point2.x - this.g.getLayoutParams().width) - 20;
            ((ViewGroup.MarginLayoutParams) this.g.getLayoutParams()).topMargin = (point2.y - this.g.getLayoutParams().height) - 160;
            this.g.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.picassocontroller.PCSPlayGroundActivity.4
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr6 = {view};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "d0f0f586098449e7045cf16c5eea2172", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "d0f0f586098449e7045cf16c5eea2172");
                    } else if (!PCSPlayGroundActivity.this.d) {
                        com.sankuai.meituan.android.ui.widget.a.a(PCSPlayGroundActivity.this, "Debug 功能只能在 VC Mode 下开启", 0).a();
                    } else {
                        f.a(PCSPlayGroundActivity.this.getApplicationContext());
                        c a3 = f.a();
                        switch (AnonymousClass5.a[g.e.ordinal()]) {
                            case 1:
                                a3.a();
                                g.e = g.a.DEBUG_CONNECTING;
                                PCSPlayGroundActivity.this.g.setBackgroundColor(-22746);
                                PCSPlayGroundActivity.this.g.setText("Connecting...");
                                PCSPlayGroundActivity.f(PCSPlayGroundActivity.this);
                                return;
                            case 2:
                                return;
                            case 3:
                                Object[] objArr7 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect7 = c.a;
                                if (PatchProxy.isSupport(objArr7, a3, changeQuickRedirect7, false, "f4be3508033cba6c18c62083cfc416ee", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, a3, changeQuickRedirect7, false, "f4be3508033cba6c18c62083cfc416ee");
                                } else {
                                    j jVar = a3.d;
                                    Object[] objArr8 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect8 = j.a;
                                    if (PatchProxy.isSupport(objArr8, jVar, changeQuickRedirect8, false, "7b36f650d558e248bd625d325881cfc0", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr8, jVar, changeQuickRedirect8, false, "7b36f650d558e248bd625d325881cfc0");
                                    } else {
                                        jVar.b.get(MetricsAnrManager.ANR_THRESHOLD).cancel();
                                    }
                                    a3.d = null;
                                }
                                g.e = g.a.DEBUG_OFF;
                                PCSPlayGroundActivity.this.g.setBackgroundColor(-3355444);
                                PCSPlayGroundActivity.this.g.setText("Debug Off");
                                return;
                            default:
                                return;
                        }
                    }
                }
            });
        }
        com.dianping.picassocontroller.vc.g gVar = this.c;
        Object[] objArr6 = {this, gVar};
        ChangeQuickRedirect changeQuickRedirect6 = d.a;
        this.j = PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "c13556fc84a6cbdb207d7678ee01bc8e", RobustBitConfig.DEFAULT_VALUE) ? (d.a) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "c13556fc84a6cbdb207d7678ee01bc8e") : new d.a(this, gVar);
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = a;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "92baab79891c352a7f4a48561633bb91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "92baab79891c352a7f4a48561633bb91");
        } else if (Build.VERSION.SDK_INT >= 23) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | Integer.MIN_VALUE | 8192);
            getWindow().setStatusBarColor(0);
        }
        j.a(new j.a() { // from class: com.dianping.picassocontroller.PCSPlayGroundActivity.1
        });
        this.i = new Dialog(this, 2131558972);
        this.i.getWindow().setLayout(-1, -1);
    }

    @Override // com.dianping.picassocontroller.vc.PicassoBaseActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c50b63c6736b7cbc34e257383971ca5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c50b63c6736b7cbc34e257383971ca5");
        } else if (PicassoKeyboardCenter.instance().isKeyboardShow(this)) {
            PicassoKeyboardCenter.instance().hideKeyboard(this);
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.dianping.picassocontroller.vc.PicassoBaseActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47c9e764aa5574f486af062e3cb1b7fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47c9e764aa5574f486af062e3cb1b7fd");
            return;
        }
        super.onPause();
        if (isFinishing()) {
            d.a aVar = this.j;
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2cd6f08f4598cd1ee8396baaaaba07f9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2cd6f08f4598cd1ee8396baaaaba07f9");
            } else if (aVar != null) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = d.a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "00c6a24d42010633a6a5b05ea1b0d2b5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "00c6a24d42010633a6a5b05ea1b0d2b5");
                    return;
                }
                aVar.b.close();
                aVar.b = null;
                PicassoKeyboardCenter.removeOnKeyBoardChangedListener(aVar.c);
                aVar.c = null;
                PicassoKeyboardCenter.resetKeyboardCenter();
            }
        }
    }

    @Override // com.dianping.picassocontroller.vc.PicassoBaseActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b347b0f4544264bf34acbe071f137961", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b347b0f4544264bf34acbe071f137961");
            return;
        }
        super.onDestroy();
        j.a((j.a) null);
    }

    @Override // com.dianping.picassocontroller.vc.PicassoBaseActivity
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1867b3e158cdd5e95d7523b2f4871c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1867b3e158cdd5e95d7523b2f4871c7");
        }
        String a2 = a("token");
        String a3 = a("serverip");
        String a4 = a(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT);
        String a5 = a("project");
        if (!TextUtils.isEmpty(a3)) {
            g.b = a3;
        }
        if (!TextUtils.isEmpty(a5)) {
            g.d = a5;
        }
        if (!TextUtils.isEmpty(a4)) {
            g.c = a4;
        }
        if (TextUtils.isEmpty(a2)) {
            if (TextUtils.isEmpty(a3)) {
                return "picasso_playground";
            }
            return AbsApiFactory.HTTP + a3;
        }
        return a2;
    }
}
