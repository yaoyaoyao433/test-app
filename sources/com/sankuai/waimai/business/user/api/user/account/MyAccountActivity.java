package com.sankuai.waimai.business.user.api.user.account;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.passport.UserCenter;
import com.meituan.passport.aq;
import com.meituan.passport.converter.m;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.user.api.user.request.AccountReq;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.foundation.core.widget.ActionBarView;
import com.sankuai.waimai.foundation.router.interfaces.c;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.af;
import com.sankuai.waimai.foundation.utils.z;
import com.sankuai.waimai.platform.capacity.imageloader.image.RoundAndCenterCropTransform;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import com.sankuai.waimai.platform.widget.emptylayout.d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MyAccountActivity extends BaseActivity implements b {
    public static ChangeQuickRedirect a;
    private static Handler j = new Handler();
    private static final Bitmap.CompressFormat l = Bitmap.CompressFormat.JPEG;
    protected ImageView b;
    protected TextView c;
    protected TextView d;
    protected TextView e;
    protected TextView f;
    protected LinearLayout g;
    protected d h;
    String i;
    private Runnable k;
    private Uri m;
    private List<String> n;
    private LinearLayout o;
    private int p;
    private int q;
    private Handler r;
    private String s;
    private View.OnClickListener t;

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity
    public final boolean ao_() {
        return true;
    }

    public MyAccountActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7196c9fc5b16aba0cbe9fecc15429a4c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7196c9fc5b16aba0cbe9fecc15429a4c");
            return;
        }
        this.k = new a();
        this.m = null;
        this.n = new ArrayList();
        this.r = new Handler(new Handler.Callback() { // from class: com.sankuai.waimai.business.user.api.user.account.MyAccountActivity.9
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8dd92681ad4a151cda1a1bce41ebb3ed", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8dd92681ad4a151cda1a1bce41ebb3ed")).booleanValue();
                }
                switch (message.what) {
                    case 1:
                        MyAccountActivity.this.v();
                        if (message.obj == null || !(message.obj instanceof String)) {
                            MyAccountActivity.this.b(MyAccountActivity.this.getString(R.string.wm_main_upload_head_portrait_failed));
                        } else {
                            MyAccountActivity.this.b((String) message.obj);
                        }
                        MyAccountActivity.this.h();
                        return false;
                    case 2:
                        MyAccountActivity.this.v();
                        MyAccountActivity.this.b_(MyAccountActivity.this.getString(R.string.wm_main_change_head_portrait_successful));
                        MyAccountActivity.this.h();
                        return false;
                    default:
                        return false;
                }
            }
        });
        this.i = null;
        this.s = null;
        this.t = new View.OnClickListener() { // from class: com.sankuai.waimai.business.user.api.user.account.MyAccountActivity.6
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e24f13d79bd5a1390a093c32ce9679d8", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e24f13d79bd5a1390a093c32ce9679d8");
                    return;
                }
                int id = view.getId();
                if (id == R.id.row_avatar) {
                    final MyAccountActivity myAccountActivity = MyAccountActivity.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = MyAccountActivity.a;
                    if (PatchProxy.isSupport(objArr3, myAccountActivity, changeQuickRedirect3, false, "76de49c8ae1b97db2cae6ccac975db59", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, myAccountActivity, changeQuickRedirect3, false, "76de49c8ae1b97db2cae6ccac975db59");
                    } else {
                        new CustomDialog.a(myAccountActivity.bB_()).a(new String[]{myAccountActivity.getString(R.string.pick_photo), myAccountActivity.getString(R.string.take_picture)}, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.user.api.user.account.MyAccountActivity.11
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                Object[] objArr4 = {dialogInterface, Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9a0f2fff83a5c690b15312998aa038f7", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9a0f2fff83a5c690b15312998aa038f7");
                                    return;
                                }
                                switch (i) {
                                    case 0:
                                        MyAccountActivity.c(MyAccountActivity.this, 0);
                                        return;
                                    case 1:
                                        MyAccountActivity.c(MyAccountActivity.this, 1);
                                        return;
                                    default:
                                        return;
                                }
                            }
                        }).b(R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.user.api.user.account.MyAccountActivity.10
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                Object[] objArr4 = {dialogInterface, Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3b5641184a8489a4386c9dce1d9252f7", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3b5641184a8489a4386c9dce1d9252f7");
                                } else {
                                    dialogInterface.dismiss();
                                }
                            }
                        }).c();
                    }
                } else if (id == R.id.row_username) {
                    MyAccountActivity myAccountActivity2 = MyAccountActivity.this;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = MyAccountActivity.a;
                    if (PatchProxy.isSupport(objArr4, myAccountActivity2, changeQuickRedirect4, false, "bea06a021502c9d66841cf309d9e89af", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, myAccountActivity2, changeQuickRedirect4, false, "bea06a021502c9d66841cf309d9e89af");
                    } else {
                        com.sankuai.waimai.foundation.router.a.a(myAccountActivity2, "https://i.meituan.com/awp/hfe/block/748d626271d8/47381/index.html");
                    }
                } else if (id == R.id.row_phone) {
                    MyAccountActivity myAccountActivity3 = MyAccountActivity.this;
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = MyAccountActivity.a;
                    if (PatchProxy.isSupport(objArr5, myAccountActivity3, changeQuickRedirect5, false, "15f95dba3fd10b86a9aee31f3642d8dd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, myAccountActivity3, changeQuickRedirect5, false, "15f95dba3fd10b86a9aee31f3642d8dd");
                    } else {
                        com.sankuai.waimai.foundation.router.a.a(myAccountActivity3, c.j);
                    }
                } else if (id == R.id.row_password) {
                    MyAccountActivity myAccountActivity4 = MyAccountActivity.this;
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = MyAccountActivity.a;
                    if (PatchProxy.isSupport(objArr6, myAccountActivity4, changeQuickRedirect6, false, "f6614ec6a27e8fefe2651b35a11d63bf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, myAccountActivity4, changeQuickRedirect6, false, "f6614ec6a27e8fefe2651b35a11d63bf");
                    } else {
                        com.sankuai.waimai.foundation.router.a.a(myAccountActivity4, "https://i.meituan.com/awp/hfe/block/abbab42214dd/47384/index.html");
                    }
                } else if (id == R.id.btn_logout) {
                    final MyAccountActivity myAccountActivity5 = MyAccountActivity.this;
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = MyAccountActivity.a;
                    if (PatchProxy.isSupport(objArr7, myAccountActivity5, changeQuickRedirect7, false, "aea7f0b4af0ec64de5118066125551ab", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, myAccountActivity5, changeQuickRedirect7, false, "aea7f0b4af0ec64de5118066125551ab");
                    } else {
                        new RooAlertDialog.a(new ContextThemeWrapper(myAccountActivity5.bB_(), 2131558627)).b(myAccountActivity5.bB_().getResources().getString(R.string.logout_dialog_msg)).a(R.string.action_settings, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.user.api.user.account.MyAccountActivity.12
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                Object[] objArr8 = {dialogInterface, Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect8 = a;
                                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "21de27770e8877faf856d14edf291e9c", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "21de27770e8877faf856d14edf291e9c");
                                    return;
                                }
                                com.sankuai.waimai.platform.domain.manager.location.a.b(MyAccountActivity.this);
                                com.sankuai.waimai.platform.domain.manager.location.a.c();
                                final MyAccountActivity myAccountActivity6 = MyAccountActivity.this;
                                final MyAccountActivity myAccountActivity7 = MyAccountActivity.this;
                                Object[] objArr9 = {myAccountActivity7};
                                ChangeQuickRedirect changeQuickRedirect9 = MyAccountActivity.a;
                                if (PatchProxy.isSupport(objArr9, myAccountActivity6, changeQuickRedirect9, false, "706db1551ac223357dfd30c98d5301b5", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr9, myAccountActivity6, changeQuickRedirect9, false, "706db1551ac223357dfd30c98d5301b5");
                                    return;
                                }
                                if (com.sankuai.waimai.imbase.manager.b.a().e()) {
                                    com.sankuai.waimai.imbase.manager.b.a().g();
                                }
                                if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
                                    myAccountActivity7.u();
                                    GlobalCartManager.getInstance().cartUpload(new GlobalCartManager.a() { // from class: com.sankuai.waimai.business.user.api.user.account.MyAccountActivity.13
                                        public static ChangeQuickRedirect a;

                                        @Override // com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager.a
                                        public final void a() {
                                            Object[] objArr10 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect10 = a;
                                            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "418e30c331cd513dff39444fd3649d80", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "418e30c331cd513dff39444fd3649d80");
                                                return;
                                            }
                                            MyAccountActivity myAccountActivity8 = myAccountActivity7;
                                            Object[] objArr11 = {myAccountActivity8};
                                            ChangeQuickRedirect changeQuickRedirect11 = com.sankuai.waimai.business.user.api.user.a.a;
                                            if (PatchProxy.isSupport(objArr11, null, changeQuickRedirect11, true, "9389d7a201418e500d2c071cf08a47c2", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr11, null, changeQuickRedirect11, true, "9389d7a201418e500d2c071cf08a47c2");
                                            } else {
                                                GlobalCartManager.getInstance().exit();
                                                UserCenter.getInstance(myAccountActivity8).logout();
                                                com.sankuai.waimai.platform.b.A().a(0L);
                                            }
                                            myAccountActivity7.v();
                                            MyAccountActivity.a(MyAccountActivity.this, myAccountActivity7);
                                        }
                                    });
                                }
                            }
                        }).b(R.string.cancel, (DialogInterface.OnClickListener) null).b();
                    }
                } else if (id != R.id.unbind_wx) {
                    if (id == R.id.cancel_account) {
                        MyAccountActivity.g(MyAccountActivity.this);
                    }
                } else {
                    final MyAccountActivity myAccountActivity6 = MyAccountActivity.this;
                    Object[] objArr8 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect8 = MyAccountActivity.a;
                    if (PatchProxy.isSupport(objArr8, myAccountActivity6, changeQuickRedirect8, false, "c4921adae8328c20a7f09ca58bd7604e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, myAccountActivity6, changeQuickRedirect8, false, "c4921adae8328c20a7f09ca58bd7604e");
                    } else {
                        new RooAlertDialog.a(new ContextThemeWrapper(myAccountActivity6.bB_(), 2131558627)).a(R.string.takeout_wx_friends_dialog_title_unbind_wx).b(TextUtils.isEmpty(myAccountActivity6.i) ? myAccountActivity6.bB_().getResources().getString(R.string.takeout_wx_friends_dialog_content_unbind_wx) : myAccountActivity6.i).a(R.string.takeout_wx_friends_dialog_ok_unbind_wx, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.user.api.user.account.MyAccountActivity.3
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                Object[] objArr9 = {dialogInterface, Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect9 = a;
                                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "9f938234bb95ce1150fb699eec61e8de", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "9f938234bb95ce1150fb699eec61e8de");
                                } else {
                                    MyAccountActivity.f(MyAccountActivity.this);
                                }
                            }
                        }).b(R.string.takeout_wx_friends_dialog_cancel_unbind_wx_2, (DialogInterface.OnClickListener) null).b();
                    }
                }
            }
        };
    }

    public static /* synthetic */ void a(MyAccountActivity myAccountActivity, Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, myAccountActivity, changeQuickRedirect, false, "e77ac243f3bb3886065385aebea2b33e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, myAccountActivity, changeQuickRedirect, false, "e77ac243f3bb3886065385aebea2b33e");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("fragment_id", 4);
        com.sankuai.waimai.foundation.router.a.a(activity, c.B, bundle);
    }

    public static /* synthetic */ void c(MyAccountActivity myAccountActivity, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, myAccountActivity, changeQuickRedirect, false, "0ede1cd830fbf5420d71d5fc5c5b62db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, myAccountActivity, changeQuickRedirect, false, "0ede1cd830fbf5420d71d5fc5c5b62db");
            return;
        }
        myAccountActivity.p = Privacy.createPermissionGuard().a(myAccountActivity, PermissionGuard.PERMISSION_STORAGE, "dj-2bda019646ab24f2");
        if (i == 0) {
            if (myAccountActivity.p > 0) {
                myAccountActivity.f();
                return;
            } else {
                Privacy.createPermissionGuard().a((Activity) myAccountActivity, PermissionGuard.PERMISSION_STORAGE, "dj-2bda019646ab24f2", new com.meituan.android.privacy.interfaces.d() { // from class: com.sankuai.waimai.business.user.api.user.account.MyAccountActivity.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.privacy.interfaces.d
                    public final void onResult(String str, int i2) {
                        Object[] objArr2 = {str, Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d4474f7b1ba0782cd7bf5a45af180d4f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d4474f7b1ba0782cd7bf5a45af180d4f");
                            return;
                        }
                        MyAccountActivity.this.p = i2;
                        if (i2 > 0) {
                            MyAccountActivity.this.f();
                        } else {
                            com.sankuai.waimai.platform.capacity.permission.b.a(MyAccountActivity.this, "修改头像前请开启存储权限");
                        }
                    }
                });
                return;
            }
        }
        myAccountActivity.q = Privacy.createPermissionGuard().a(myAccountActivity, PermissionGuard.PERMISSION_CAMERA, "dj-2bda019646ab24f2");
        if (myAccountActivity.q > 0 && myAccountActivity.p > 0) {
            myAccountActivity.g();
        } else if (myAccountActivity.q < 0) {
            Privacy.createPermissionGuard().a((Activity) myAccountActivity, PermissionGuard.PERMISSION_CAMERA, "dj-2bda019646ab24f2", new com.meituan.android.privacy.interfaces.d() { // from class: com.sankuai.waimai.business.user.api.user.account.MyAccountActivity.7
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.interfaces.d
                public final void onResult(String str, int i2) {
                    Object[] objArr2 = {str, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8da2fe987f73281526bcf22cec82c850", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8da2fe987f73281526bcf22cec82c850");
                        return;
                    }
                    MyAccountActivity.this.q = i2;
                    if (MyAccountActivity.this.p > 0 && MyAccountActivity.this.q > 0) {
                        MyAccountActivity.this.g();
                    } else {
                        com.sankuai.waimai.platform.capacity.permission.b.a(MyAccountActivity.this, "修改头像前请开启拍照和存储权限");
                    }
                }
            });
        }
    }

    public static /* synthetic */ void f(MyAccountActivity myAccountActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, myAccountActivity, changeQuickRedirect, false, "c8e0796559f703b27795a4b9b03e8bf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, myAccountActivity, changeQuickRedirect, false, "c8e0796559f703b27795a4b9b03e8bf6");
            return;
        }
        myAccountActivity.u();
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((AccountReq) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) AccountReq.class)).unbind(), new b.AbstractC1042b<BaseResponse<String>>() { // from class: com.sankuai.waimai.business.user.api.user.account.MyAccountActivity.4
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "133b2f1bf59e549683b6d994b6e86fdc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "133b2f1bf59e549683b6d994b6e86fdc");
                    return;
                }
                MyAccountActivity.this.v();
                if (baseResponse == null) {
                    MyAccountActivity.this.d(R.string.takeout_loading_fail_try_afterwhile);
                } else if (baseResponse.code != 0) {
                } else {
                    ae.a(MyAccountActivity.this.bB_(), (int) R.string.takeout_wx_friends_dialog_success_unbind_wx);
                    MyAccountActivity.this.a(true);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4b8e8df033d80b4c3742d11f47aceae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4b8e8df033d80b4c3742d11f47aceae");
                    return;
                }
                MyAccountActivity.this.v();
                MyAccountActivity.this.d(R.string.takeout_loading_fail_try_afterwhile);
            }
        }, myAccountActivity.w());
    }

    public static /* synthetic */ void g(MyAccountActivity myAccountActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, myAccountActivity, changeQuickRedirect, false, "ce6cc3c23c08e0b7646c0790643f3fe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, myAccountActivity, changeQuickRedirect, false, "ce6cc3c23c08e0b7646c0790643f3fe5");
        } else if (!TextUtils.isEmpty(myAccountActivity.s)) {
            com.sankuai.waimai.foundation.router.a.a(myAccountActivity, myAccountActivity.s);
        } else {
            new RooAlertDialog.a(new ContextThemeWrapper(myAccountActivity.bB_(), 2131558627)).b(myAccountActivity.bB_().getResources().getString(R.string.login_cancel_account_dialog_msg)).a(R.string.takeout_connect_custom_service, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.user.api.user.account.MyAccountActivity.5
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9241eb8c19b2d41212d8ff361852bb74", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9241eb8c19b2d41212d8ff361852bb74");
                    } else {
                        z.a(MyAccountActivity.this.bB_(), MyAccountActivity.this.bB_().getResources().getString(R.string.service_phone_default));
                    }
                }
            }).b(R.string.cancel, (DialogInterface.OnClickListener) null).b();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class a implements Runnable {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {MyAccountActivity.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62c8a6f8bef82b2560b597e566142389", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62c8a6f8bef82b2560b597e566142389");
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69e43e267f1b2b032777e1eb90500dc2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69e43e267f1b2b032777e1eb90500dc2");
                return;
            }
            aq.a(MyAccountActivity.this.getApplicationContext()).a((Activity) MyAccountActivity.this);
            User b = com.sankuai.waimai.platform.domain.manager.user.a.i().b();
            if (b == null) {
                return;
            }
            if (!TextUtils.isEmpty(b.username)) {
                MyAccountActivity.this.d.setText(b.username);
            } else {
                MyAccountActivity.this.d.setText(R.string.user_admin_not_set_password);
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8abb3ac8f46b179ceaa5c393d23942aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8abb3ac8f46b179ceaa5c393d23942aa");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.takeout_activity_my_account);
        c(R.string.title_activity_my_account);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f883c0390f3ca88b0442532fa184f0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f883c0390f3ca88b0442532fa184f0c");
        } else {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.sankuai.waimai.business.user.api.user.account.MyAccountActivity.14
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f0357adb235633011fd13f1d8705f150", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f0357adb235633011fd13f1d8705f150");
                    } else {
                        MyAccountActivity.this.finish();
                    }
                }
            };
            Object[] objArr3 = {onClickListener};
            ChangeQuickRedirect changeQuickRedirect3 = BaseActivity.w;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0d3828d68fcc700ab81cb41bf6c93e74", RobustBitConfig.DEFAULT_VALUE)) {
                TextView textView = (TextView) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0d3828d68fcc700ab81cb41bf6c93e74");
            } else if (this.x != null) {
                ActionBarView actionBarView = this.x;
                Object[] objArr4 = {onClickListener};
                ChangeQuickRedirect changeQuickRedirect4 = ActionBarView.a;
                if (PatchProxy.isSupport(objArr4, actionBarView, changeQuickRedirect4, false, "34be410dd5a03a7aa62077774c62d1e2", RobustBitConfig.DEFAULT_VALUE)) {
                    TextView textView2 = (TextView) PatchProxy.accessDispatch(objArr4, actionBarView, changeQuickRedirect4, false, "34be410dd5a03a7aa62077774c62d1e2");
                } else {
                    actionBarView.b.setOnClickListener(onClickListener);
                    TextView textView3 = actionBarView.b;
                }
            }
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "77f5940881daaa29e0b27b4220862c70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "77f5940881daaa29e0b27b4220862c70");
        } else {
            this.o = (LinearLayout) findViewById(R.id.cancel_account);
            this.o.setOnClickListener(this.t);
            this.b = (ImageView) findViewById(R.id.img_avatar);
            this.c = (TextView) findViewById(R.id.txt_user_password_modify);
            this.d = (TextView) findViewById(R.id.txt_username);
            this.e = (TextView) findViewById(R.id.txt_bind_phone);
            this.f = (TextView) findViewById(R.id.txt_bind_phone_hint);
            this.g = (LinearLayout) findViewById(R.id.unbind_wx);
            this.g.setOnClickListener(this.t);
            findViewById(R.id.row_avatar).setOnClickListener(this.t);
            findViewById(R.id.row_username).setOnClickListener(this.t);
            findViewById(R.id.row_phone).setOnClickListener(this.t);
            findViewById(R.id.row_password).setOnClickListener(this.t);
            findViewById(R.id.btn_logout).setOnClickListener(this.t);
        }
        this.h = new d(this);
        com.sankuai.waimai.platform.domain.manager.user.a.i().a((com.sankuai.waimai.foundation.core.service.user.b) this);
        d();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecccdf10fc5260f1fe532314532696a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecccdf10fc5260f1fe532314532696a0");
            return;
        }
        bundle.putParcelable("key_image_uri", this.m);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0a05bb3215c65b95029c15885cc0fe6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0a05bb3215c65b95029c15885cc0fe6");
            return;
        }
        super.onRestoreInstanceState(bundle);
        this.m = (Uri) bundle.getParcelable("key_image_uri");
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9dc809ab279de6d59ab95b7a1017969", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9dc809ab279de6d59ab95b7a1017969");
            return;
        }
        super.onNewIntent(intent);
        if (intent == null) {
            return;
        }
        setIntent(intent);
        d();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b8247b4423f9039e48898b5bcdbf897", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b8247b4423f9039e48898b5bcdbf897");
            return;
        }
        super.onDestroy();
        j.removeCallbacks(this.k);
        j.removeCallbacksAndMessages(null);
        com.sankuai.waimai.platform.domain.manager.user.a.i().b((com.sankuai.waimai.foundation.core.service.user.b) this);
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public void onChanged(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c1ae6a3276b8e6eb75f918e6463950c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c1ae6a3276b8e6eb75f918e6463950c");
        } else if (!com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
            finish();
        } else {
            j.postDelayed(this.k, 500L);
            d();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
        Object[] objArr = {enumC0948b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6750221485810a11b17e8d9d3563e55a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6750221485810a11b17e8d9d3563e55a");
        } else {
            d();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Bitmap bitmap;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d384e1e9115ac9d055e7d2ad800167f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d384e1e9115ac9d055e7d2ad800167f0");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            switch (i) {
                case 1:
                    if (!af.b(this.m)) {
                        final Uri uri = this.m;
                        Object[] objArr2 = {uri};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3fef683fd4e126af93f7c3652f628816", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3fef683fd4e126af93f7c3652f628816");
                        } else {
                            AsyncTask<Void, Void, Boolean> asyncTask = new AsyncTask<Void, Void, Boolean>() { // from class: com.sankuai.waimai.business.user.api.user.account.MyAccountActivity.8
                                public static ChangeQuickRedirect a;

                                @Override // android.os.AsyncTask
                                public final /* bridge */ /* synthetic */ void onCancelled(Boolean bool) {
                                }

                                @Override // android.os.AsyncTask
                                public final /* synthetic */ void onPostExecute(Boolean bool) {
                                    Boolean bool2 = bool;
                                    Object[] objArr3 = {bool2};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "162eda245508345392262b42234aeb6e", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "162eda245508345392262b42234aeb6e");
                                        return;
                                    }
                                    super.onPostExecute(bool2);
                                    MyAccountActivity.this.v();
                                    if (!bool2.booleanValue()) {
                                        MyAccountActivity.this.b(MyAccountActivity.this.getString(R.string.wm_main_deal_pic_failed));
                                        MyAccountActivity.this.h();
                                        return;
                                    }
                                    MyAccountActivity.this.b(uri);
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
                                /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
                                @Override // android.os.AsyncTask
                                /* renamed from: a */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public java.lang.Boolean doInBackground(java.lang.Void... r11) {
                                    /*
                                        r10 = this;
                                        r0 = 1
                                        java.lang.Object[] r0 = new java.lang.Object[r0]
                                        r8 = 0
                                        r0[r8] = r11
                                        com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.waimai.business.user.api.user.account.MyAccountActivity.AnonymousClass8.a
                                        java.lang.String r9 = "dbfff386ca1352dabb0fd22582cae51c"
                                        r4 = 0
                                        r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                                        r1 = r0
                                        r2 = r10
                                        r3 = r11
                                        r5 = r9
                                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                                        if (r1 == 0) goto L1e
                                        java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r0, r10, r11, r8, r9)
                                        java.lang.Boolean r11 = (java.lang.Boolean) r11
                                        return r11
                                    L1e:
                                        java.lang.String r11 = ""
                                        r0 = 0
                                        com.sankuai.waimai.business.user.api.user.account.MyAccountActivity r1 = com.sankuai.waimai.business.user.api.user.account.MyAccountActivity.this     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L57
                                        android.content.ContentResolver r2 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L57
                                        android.net.Uri r3 = r2     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L57
                                        r4 = 0
                                        r5 = 0
                                        r6 = 0
                                        r7 = 0
                                        android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L57
                                        if (r1 == 0) goto L4a
                                        boolean r0 = r1.moveToNext()     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
                                        if (r0 == 0) goto L4a
                                        java.lang.String r0 = "_data"
                                        int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
                                        java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
                                        r11 = r0
                                        goto L4a
                                    L45:
                                        r11 = move-exception
                                        r0 = r1
                                        goto L51
                                    L48:
                                        r0 = r1
                                        goto L57
                                    L4a:
                                        if (r1 == 0) goto L5c
                                        r1.close()
                                        goto L5c
                                    L50:
                                        r11 = move-exception
                                    L51:
                                        if (r0 == 0) goto L56
                                        r0.close()
                                    L56:
                                        throw r11
                                    L57:
                                        if (r0 == 0) goto L5c
                                        r0.close()
                                    L5c:
                                        boolean r0 = android.text.TextUtils.isEmpty(r11)
                                        if (r0 == 0) goto L65
                                        java.lang.Boolean r11 = java.lang.Boolean.FALSE
                                        return r11
                                    L65:
                                        android.net.Uri r11 = android.net.Uri.parse(r11)
                                        android.graphics.Bitmap$CompressFormat r0 = com.sankuai.waimai.business.user.api.user.account.MyAccountActivity.b()
                                        r1 = 300(0x12c, float:4.2E-43)
                                        boolean r11 = com.sankuai.waimai.platform.utils.e.a(r11, r0, r1, r1)
                                        java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
                                        return r11
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.user.api.user.account.MyAccountActivity.AnonymousClass8.doInBackground(java.lang.Void[]):java.lang.Boolean");
                                }
                            };
                            u();
                            com.sankuai.waimai.launcher.util.aop.b.a(asyncTask, new Void[0]);
                        }
                        this.m = null;
                        break;
                    } else {
                        b(getString(R.string.wm_main_get_pic_failed));
                        h();
                        break;
                    }
                case 2:
                    if (intent != null && intent.getData() != null) {
                        b(intent.getData());
                        break;
                    } else {
                        b(getString(R.string.wm_main_get_pic_failed));
                        break;
                    }
                    break;
                case 3:
                    if (intent != null && intent.getData() != null) {
                        this.m = intent.getData();
                    }
                    if (af.b(this.m)) {
                        bitmap = null;
                    } else {
                        try {
                            bitmap = com.sankuai.waimai.launcher.util.image.a.a(this.m.getPath());
                        } catch (OutOfMemoryError unused) {
                            bitmap = null;
                        }
                        this.m = null;
                    }
                    if (bitmap != null) {
                        u();
                        final com.sankuai.waimai.business.user.api.user.request.a aVar = new com.sankuai.waimai.business.user.api.user.request.a(this.r);
                        Object[] objArr3 = {this, bitmap};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.user.api.user.request.a.a;
                        if (!PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "dcc391d26583418342246aeb75fe331f", RobustBitConfig.DEFAULT_VALUE)) {
                            if (bitmap != null && !bitmap.isRecycled()) {
                                com.meituan.passport.addifun.information.a.a(new m<String>() { // from class: com.sankuai.waimai.business.user.api.user.request.a.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.meituan.passport.converter.m
                                    public final /* synthetic */ void a(String str) {
                                        String str2 = str;
                                        Object[] objArr4 = {str2};
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "74fa0c5f33fc141784d5a09a24e840c0", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "74fa0c5f33fc141784d5a09a24e840c0");
                                            return;
                                        }
                                        a aVar2 = aVar;
                                        Object[] objArr5 = {str2};
                                        ChangeQuickRedirect changeQuickRedirect5 = a.a;
                                        if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "3bb008ed813d3ae85f5948b12972a740", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "3bb008ed813d3ae85f5948b12972a740");
                                        } else {
                                            aVar2.b.obtainMessage(2, str2).sendToTarget();
                                        }
                                    }
                                }, this, bitmap);
                                break;
                            } else {
                                Object[] objArr4 = {null};
                                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.user.api.user.request.a.a;
                                if (!PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "1bbf6e89fbaf349af5fe97e3a5bbd9b0", RobustBitConfig.DEFAULT_VALUE)) {
                                    aVar.b.obtainMessage(1, null).sendToTarget();
                                    break;
                                } else {
                                    PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "1bbf6e89fbaf349af5fe97e3a5bbd9b0");
                                    break;
                                }
                            }
                        } else {
                            ((Boolean) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "dcc391d26583418342246aeb75fe331f")).booleanValue();
                            break;
                        }
                    } else {
                        b(getString(R.string.wm_main_clip_pic_failed));
                        h();
                        break;
                    }
                    break;
            }
        }
        com.meituan.android.privacy.aop.a.b();
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0fc55a2effc8b5aedc7496415a10c5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0fc55a2effc8b5aedc7496415a10c5a");
            return;
        }
        User b = com.sankuai.waimai.platform.domain.manager.user.a.i().b();
        if (b == null) {
            return;
        }
        b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
        a2.b = this;
        a2.c = b.avatarurl;
        b.C0608b b2 = a2.b(getResources().getDimensionPixelSize(R.dimen.takeout_my_account_avatar_width));
        b2.i = R.drawable.wm_user_avatar_default;
        b2.f = ImageQualityUtil.a(0);
        b2.a(new RoundAndCenterCropTransform((Context) this, true)).a(this.b);
        if (!TextUtils.isEmpty(b.username)) {
            this.d.setText(b.username);
        } else {
            this.d.setText(R.string.user_admin_not_set_password);
        }
        String str = b.mobile;
        if (!TextUtils.isEmpty(str)) {
            this.f.setText(aa.b(str));
        } else {
            this.f.setText(R.string.bind);
        }
        if (b.hasPassword == 1) {
            this.c.setText(R.string.user_admin_modify);
        } else {
            this.c.setText(R.string.user_admin_not_set_password);
        }
        this.h.d();
        a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b07b8747158e27b2901ef802ce419d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b07b8747158e27b2901ef802ce419d5");
        } else {
            z.a(bB_(), 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e525543f36a5f9db744d9c1fb3e58fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e525543f36a5f9db744d9c1fb3e58fc");
            return;
        }
        this.m = com.sankuai.waimai.business.user.api.user.b.a(this);
        if (af.b(this.m)) {
            return;
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", this.m);
        startActivityForResult(intent, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94a3a201c9b0061ee489be30eb0f86fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94a3a201c9b0061ee489be30eb0f86fe");
            return;
        }
        if (uri != null) {
            this.m = com.sankuai.waimai.business.user.api.user.b.b(this);
        }
        if (af.b(uri) || af.b(this.m)) {
            h();
            return;
        }
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, "image/*");
        intent.putExtra("crop", "true");
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        intent.putExtra("outputX", 300);
        intent.putExtra("outputY", 300);
        intent.putExtra("scale", true);
        intent.putExtra("scaleUpIfNeeded", true);
        intent.putExtra("return-data", false);
        intent.putExtra("output", this.m);
        intent.putExtra("outputFormat", l.toString());
        try {
            startActivityForResult(intent, 3);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9a86fcef1366e7bcd4da18cbbadb6a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9a86fcef1366e7bcd4da18cbbadb6a4");
        } else if (this.n != null) {
            for (String str : this.n) {
                if (str != null) {
                    new File(str).delete();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab836aa0a95f65adbe6771e0dd058a03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab836aa0a95f65adbe6771e0dd058a03");
        } else {
            b_(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72543b130c19b9418f101a55b2d00e9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72543b130c19b9418f101a55b2d00e9a");
            return;
        }
        if (z) {
            u();
        }
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((AccountReq) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) AccountReq.class)).accountInfo(), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.user.api.user.response.a>>() { // from class: com.sankuai.waimai.business.user.api.user.account.MyAccountActivity.2
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "02d1466e8b3554f1ab8a976aa663b389", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "02d1466e8b3554f1ab8a976aa663b389");
                } else if (baseResponse == null || baseResponse.data == 0) {
                } else {
                    if (((com.sankuai.waimai.business.user.api.user.response.a) baseResponse.data).b == 1) {
                        MyAccountActivity.this.g.setVisibility(0);
                    } else {
                        MyAccountActivity.this.g.setVisibility(8);
                    }
                    MyAccountActivity.this.i = ((com.sankuai.waimai.business.user.api.user.response.a) baseResponse.data).a;
                    MyAccountActivity.this.s = ((com.sankuai.waimai.business.user.api.user.response.a) baseResponse.data).c;
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e83c57371ced6e7cd09fa6abcb363536", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e83c57371ced6e7cd09fa6abcb363536");
                } else {
                    MyAccountActivity.this.g.setVisibility(8);
                }
            }

            @Override // com.sankuai.waimai.platform.capacity.network.retrofit.b.AbstractC1042b, rx.e
            public final void onCompleted() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4199981b89d5d0f2c1efc4a0c611e96", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4199981b89d5d0f2c1efc4a0c611e96");
                    return;
                }
                MyAccountActivity.this.v();
                MyAccountActivity.this.h.h();
            }
        }, w());
    }
}
