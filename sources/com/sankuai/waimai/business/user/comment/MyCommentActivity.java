package com.sankuai.waimai.business.user.comment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.waimai.business.user.comment.a;
import com.sankuai.waimai.business.user.comment.net.CommentApi;
import com.sankuai.waimai.foundation.core.service.screenshot.observer.b;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.foundation.utils.n;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.log.judas.f;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.core.comment.Comment;
import com.sankuai.waimai.platform.domain.core.comment.ShareInfo;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MyCommentActivity extends BaseUserCommentListActivity implements a.b, a.c, a.d {
    public static ChangeQuickRedirect v;
    private com.sankuai.waimai.foundation.core.service.screenshot.observer.a D;
    private f.b E;

    public MyCommentActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3879e22224a802fa2ec558ac6cedf438", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3879e22224a802fa2ec558ac6cedf438");
            return;
        }
        this.D = new b() { // from class: com.sankuai.waimai.business.user.comment.MyCommentActivity.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.core.service.screenshot.observer.b, com.sankuai.waimai.foundation.core.service.screenshot.observer.a
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "05eee03acb9b6c7d049f17fcfd37e3f3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "05eee03acb9b6c7d049f17fcfd37e3f3");
                } else if (TextUtils.equals(str, MyCommentActivity.class.getName())) {
                    JudasManualManager.a("b_nbk148vf").a("c_d900sgd").a(MyCommentActivity.this).a();
                }
            }
        };
        this.E = new f.b() { // from class: com.sankuai.waimai.business.user.comment.MyCommentActivity.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.log.judas.f.b
            public final void b(int i) {
            }

            @Override // com.sankuai.waimai.log.judas.f.b
            public final void a(int i) {
                Comment item;
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "81f11691da29da088911d931ad1497cb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "81f11691da29da088911d931ad1497cb");
                } else if (i < 0 || MyCommentActivity.this.j == null || i >= MyCommentActivity.this.j.getCount() || (item = MyCommentActivity.this.j.getItem(i)) == null) {
                } else {
                    JudasManualManager.b("b_1rpvt7rd").a("poi_id", item.poiId).a("c_d900sgd").a(MyCommentActivity.this).a();
                }
            }
        };
    }

    public static /* synthetic */ void a(MyCommentActivity myCommentActivity, final Comment comment) {
        Object[] objArr = {comment};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, myCommentActivity, changeQuickRedirect, false, "54c1c3d9cc518701ce4155ca378a3b89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, myCommentActivity, changeQuickRedirect, false, "54c1c3d9cc518701ce4155ca378a3b89");
            return;
        }
        myCommentActivity.u();
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((CommentApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) CommentApi.class)).deleteComment(comment.id, comment.poiId), new b.AbstractC1042b<BaseResponse<Object>>() { // from class: com.sankuai.waimai.business.user.comment.MyCommentActivity.8
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ea0a5886a6e4c3d471b6cc68981a423", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ea0a5886a6e4c3d471b6cc68981a423");
                } else if (baseResponse == null) {
                    onError(null);
                } else if (MyCommentActivity.this.isFinishing()) {
                } else {
                    MyCommentActivity.this.v();
                    String a2 = com.sankuai.waimai.platform.capacity.network.errorhanding.b.a(MyCommentActivity.this.bB_(), baseResponse);
                    if (TextUtils.isEmpty(a2)) {
                        if (MyCommentActivity.this.t != null && MyCommentActivity.this.t.b > 0) {
                            MyCommentActivity.this.t.b--;
                            MyCommentActivity.this.a(MyCommentActivity.this.t.b);
                        }
                        a aVar = MyCommentActivity.this.j;
                        Comment comment2 = comment;
                        Object[] objArr3 = {comment2};
                        ChangeQuickRedirect changeQuickRedirect3 = a.a;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "4186171ce42941db9e6d50d9baf53388", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "4186171ce42941db9e6d50d9baf53388");
                        } else if (comment2 != null) {
                            aVar.b.remove(comment2);
                            aVar.notifyDataSetChanged();
                        }
                        MyCommentActivity.this.d(R.string.wm_comment_delete_successfully);
                        return;
                    }
                    MyCommentActivity.this.b_(a2);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b1c2ba25194e56633dafd4918825d7f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b1c2ba25194e56633dafd4918825d7f");
                } else if (MyCommentActivity.this.isFinishing()) {
                } else {
                    MyCommentActivity.this.v();
                    com.sankuai.waimai.platform.capacity.network.errorhanding.b.a(MyCommentActivity.this.bB_(), (Throwable) null);
                }
            }
        }, myCommentActivity.w());
    }

    public static /* synthetic */ boolean a(MyCommentActivity myCommentActivity, String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, myCommentActivity, changeQuickRedirect, false, "7c44a36958cf0941b4a0050bd3073db9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, myCommentActivity, changeQuickRedirect, false, "7c44a36958cf0941b4a0050bd3073db9")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || j <= 0) {
            return false;
        }
        myCommentActivity.u();
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((CommentApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) CommentApi.class)).submitComment(j, str), new b.AbstractC1042b<BaseResponse<Object>>() { // from class: com.sankuai.waimai.business.user.comment.MyCommentActivity.10
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "32634bec61ccb8fb62dd4ee724bbdcb9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "32634bec61ccb8fb62dd4ee724bbdcb9");
                } else if (baseResponse == null) {
                    onError(null);
                } else if (MyCommentActivity.this.isFinishing()) {
                } else {
                    String a2 = com.sankuai.waimai.platform.capacity.network.errorhanding.b.a(MyCommentActivity.this.bB_(), baseResponse);
                    if (TextUtils.isEmpty(a2)) {
                        MyCommentActivity.this.f();
                        return;
                    }
                    MyCommentActivity.this.v();
                    MyCommentActivity.this.b_(a2);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b91cac823ed4dd535de5e9498cb7f23d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b91cac823ed4dd535de5e9498cb7f23d");
                } else if (MyCommentActivity.this.isFinishing()) {
                } else {
                    MyCommentActivity.this.v();
                    com.sankuai.waimai.platform.capacity.network.errorhanding.b.a(MyCommentActivity.this.bB_(), (Throwable) null);
                }
            }
        }, myCommentActivity.w());
        return true;
    }

    @Override // com.sankuai.waimai.business.user.comment.BaseUserCommentListActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6998f3b0b7b63fa6a203ea79736e582", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6998f3b0b7b63fa6a203ea79736e582");
            return;
        }
        super.onCreate(bundle);
        com.sankuai.waimai.platform.domain.manager.user.a.a(bB_(), new Runnable() { // from class: com.sankuai.waimai.business.user.comment.MyCommentActivity.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "67b90593b9cd025aff25fd1f9103b403", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "67b90593b9cd025aff25fd1f9103b403");
                } else if (MyCommentActivity.this.isFinishing()) {
                } else {
                    MyCommentActivity.this.g();
                }
            }
        }, new Runnable() { // from class: com.sankuai.waimai.business.user.comment.MyCommentActivity.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3066fc68d8e956408ab5516cefc6bf82", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3066fc68d8e956408ab5516cefc6bf82");
                } else if (MyCommentActivity.this.isFinishing()) {
                } else {
                    MyCommentActivity.this.finish();
                }
            }
        });
        this.i.setOnLogReportListener(this.E);
        com.sankuai.waimai.foundation.core.service.screenshot.a.a().a(this.D);
        this.i.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.business.user.comment.MyCommentActivity.5
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "310f0952c91d8b2a0278729bd5c863f6", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "310f0952c91d8b2a0278729bd5c863f6")).booleanValue();
                }
                if (motionEvent.getAction() == 0) {
                    MyCommentActivity.this.j();
                }
                return false;
            }
        });
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53ae8e02d689fc320dbb76f629e30a9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53ae8e02d689fc320dbb76f629e30a9c");
            return;
        }
        JudasManualManager.a("c_d900sgd", this);
        super.onResume();
        this.i.a();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2235b1f595ee28013d59c16db01a52c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2235b1f595ee28013d59c16db01a52c6");
            return;
        }
        super.onStop();
        j();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bd6bacb256080f0991049f2889b4265", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bd6bacb256080f0991049f2889b4265");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.foundation.core.service.screenshot.a.a().b(this.D);
    }

    @Override // com.sankuai.waimai.business.user.comment.BaseUserCommentListActivity
    public final a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0882d8220a74fd2b45851a6d261eb3ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0882d8220a74fd2b45851a6d261eb3ce");
        }
        a aVar = new a(this, 2, this, "");
        aVar.c = this;
        aVar.d = this;
        aVar.e = this;
        return aVar;
    }

    @Override // com.sankuai.waimai.business.user.comment.BaseUserCommentListActivity
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67516be547f16a4982216ef4800685a3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67516be547f16a4982216ef4800685a3") : getResources().getString(R.string.wm_comment_my_comment);
    }

    @Override // com.sankuai.waimai.business.user.comment.a.b
    public final void a(@NonNull Comment comment) {
        Object[] objArr = {comment};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bc1425271f2581ac34723748b50311d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bc1425271f2581ac34723748b50311d");
        } else if (comment.canAddComment()) {
            final long j = comment.id;
            Object[] objArr2 = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = v;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cad807282b83b32541f4a8425a183dce", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cad807282b83b32541f4a8425a183dce");
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = v;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "79041604b82bb10e2277e6a2359f95d3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "79041604b82bb10e2277e6a2359f95d3");
            } else if (this.k.getVisibility() != 0) {
                this.k.setVisibility(0);
                this.o.requestFocus();
                this.o.post(new Runnable() { // from class: com.sankuai.waimai.business.user.comment.MyCommentActivity.9
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4f0978954216a6bb55f48994f2980cca", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4f0978954216a6bb55f48994f2980cca");
                        } else {
                            n.a(MyCommentActivity.this.o, MyCommentActivity.this.bB_());
                        }
                    }
                });
            }
            this.n.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.user.comment.MyCommentActivity.6
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "726fc90cd386f8b841868def59ea2abf", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "726fc90cd386f8b841868def59ea2abf");
                    } else if (MyCommentActivity.a(MyCommentActivity.this, MyCommentActivity.this.o.getText().toString(), j)) {
                        MyCommentActivity.this.j();
                    } else {
                        MyCommentActivity.this.d(R.string.wm_comment_submit_review_failed);
                    }
                }
            });
        } else {
            String str = comment.disableAdditionalMsg;
            Object[] objArr4 = {str, Integer.valueOf((int) R.string.wm_loading_net_error_info), this};
            ChangeQuickRedirect changeQuickRedirect4 = aa.a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "e88eddf69db467054558c8251e4037b6", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "e88eddf69db467054558c8251e4037b6");
            } else if (TextUtils.isEmpty(str)) {
                str = getString(R.string.wm_loading_net_error_info);
            }
            b_(str);
        }
    }

    @Override // com.sankuai.waimai.business.user.comment.a.d
    public final void a(ShareInfo shareInfo) {
        Object[] objArr = {shareInfo};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "868b39df26dcbf9819d2653fc1e76c0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "868b39df26dcbf9819d2653fc1e76c0d");
        } else if (shareInfo != null && shareInfo.checkShareParams()) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("intent_share_info", shareInfo);
            bundle.putString("intent_share_info_rn", k.a().toJson(shareInfo));
            bundle.putInt("source", 2);
            com.sankuai.waimai.foundation.router.a.a(this, getString(R.string.wm_mine_comment_share_jump_url), bundle);
        } else {
            d(R.string.wm_comment_failed_to_share);
        }
    }

    @Override // com.sankuai.waimai.business.user.comment.a.c
    public final void b(@NonNull final Comment comment) {
        Object[] objArr = {comment};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68a887af768eae40bae373aae9679994", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68a887af768eae40bae373aae9679994");
        } else {
            new RooAlertDialog.a(new ContextThemeWrapper(bB_(), 2131558627)).b(R.string.wm_comment_confirm_delete_review).a(R.string.confirm, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.user.comment.MyCommentActivity.7
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1516f0456814e7b64cb00ef6b5b8d02a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1516f0456814e7b64cb00ef6b5b8d02a");
                    } else {
                        MyCommentActivity.a(MyCommentActivity.this, comment);
                    }
                }
            }).b(R.string.cancel, (DialogInterface.OnClickListener) null).b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b707a76d059b1a2421fe99294b6814a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b707a76d059b1a2421fe99294b6814a");
        } else if (this.k.getVisibility() != 0) {
        } else {
            this.n.setOnClickListener(null);
            this.o.setText((CharSequence) null);
            this.o.clearFocus();
            this.k.setVisibility(8);
            n.a(bB_());
        }
    }
}
