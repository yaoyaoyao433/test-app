package com.sankuai.waimai.business.user.comment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.user.comment.adapter.a;
import com.sankuai.waimai.business.user.comment.net.CommentApi;
import com.sankuai.waimai.business.user.comment.net.response.MyCommentResponse;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.router.interfaces.c;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.log.judas.StatisticsListView;
import com.sankuai.waimai.platform.capacity.imageloader.image.RoundAndCenterCropTransform;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.core.comment.Comment;
import com.sankuai.waimai.platform.domain.core.comment.Picture;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.platform.widget.emptylayout.d;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class BaseUserCommentListActivity extends BaseActivity implements a.InterfaceC0880a {
    public static ChangeQuickRedirect a;
    private ImageView D;
    private boolean E;
    private long F;
    protected int b;
    protected boolean c;
    protected boolean d;
    protected d e;
    protected d f;
    protected View g;
    protected View h;
    protected StatisticsListView i;
    protected a j;
    protected View k;
    protected TextView l;
    protected View m;
    protected TextView n;
    protected EditText o;
    protected ImageView p;
    protected TextView q;
    protected TextView r;
    protected String s;
    protected MyCommentResponse t;
    public int u;
    private View v;

    public abstract a b();

    public abstract String d();

    public long i() {
        return 0L;
    }

    public BaseUserCommentListActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "035e5af8dbf6e11309b8d9019ef128bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "035e5af8dbf6e11309b8d9019ef128bd");
            return;
        }
        this.b = 0;
        this.c = false;
        this.d = false;
        this.E = true;
        this.F = 0L;
        this.u = 0;
    }

    public static /* synthetic */ boolean a(BaseUserCommentListActivity baseUserCommentListActivity, boolean z) {
        baseUserCommentListActivity.E = false;
        return false;
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "334251a179e240139d035ae738caae1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "334251a179e240139d035ae738caae1d");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.wm_comment_list_activity_user);
        Intent intent = getIntent();
        this.F = f.a(intent, "comment_id", 0L);
        if (this.F == 0) {
            this.F = com.sankuai.waimai.foundation.router.a.a(intent, "comment_id", 0L);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "995dc3947aac8049f15a87d829997e09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "995dc3947aac8049f15a87d829997e09");
            return;
        }
        this.l = (TextView) findViewById(R.id.txt_my_comment_actionbar_title);
        this.m = findViewById(R.id.img_my_comment_back);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.sankuai.waimai.business.user.comment.BaseUserCommentListActivity.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "69451c04016928047e76e4720ee67d10", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "69451c04016928047e76e4720ee67d10");
                } else {
                    BaseUserCommentListActivity.this.finish();
                }
            }
        };
        this.l.setOnClickListener(onClickListener);
        this.m.setOnClickListener(onClickListener);
        this.h = LayoutInflater.from(this).inflate(R.layout.wm_comment_list_view_my_comment_header, (ViewGroup) null);
        this.v = this.h.findViewById(R.id.layout_user_name);
        this.D = (ImageView) this.h.findViewById(R.id.img_vip);
        this.p = (ImageView) this.h.findViewById(R.id.img_avatar);
        this.q = (TextView) this.h.findViewById(R.id.txt_my_comment_username);
        this.r = (TextView) this.h.findViewById(R.id.txt_my_comment_count);
        this.g = findViewById(R.id.container_my_comment);
        this.i = (StatisticsListView) findViewById(R.id.list_my_comment);
        this.j = b();
        this.i.addHeaderView(this.h);
        this.i.setAdapter((ListAdapter) this.j);
        this.g.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.sankuai.waimai.business.user.comment.BaseUserCommentListActivity.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Object[] objArr3 = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "42e1b6e99a2fdce6f184e37b81873f1d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "42e1b6e99a2fdce6f184e37b81873f1d");
                    return;
                }
                BaseUserCommentListActivity.this.g.removeOnLayoutChangeListener(this);
                ah.a(BaseUserCommentListActivity.this.findViewById(R.id.layout_my_comment_panel), 0, BaseUserCommentListActivity.this.findViewById(R.id.root_my_comment).getHeight());
            }
        });
        this.i.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.sankuai.waimai.business.user.comment.BaseUserCommentListActivity.3
            public static ChangeQuickRedirect a;

            @Override // android.widget.AbsListView.OnScrollListener
            public final void onScrollStateChanged(AbsListView absListView, int i) {
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
                View childAt;
                Object[] objArr3 = {absListView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ebdce06fc3173974143478be3792132b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ebdce06fc3173974143478be3792132b");
                    return;
                }
                if (i == 0 && (childAt = absListView.getChildAt(0)) != null) {
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    if (top == 0 && bottom != 0) {
                        BaseUserCommentListActivity.this.u = childAt.getBottom();
                    }
                    float f = ((BaseUserCommentListActivity.this.u - bottom) * 1.0f) / BaseUserCommentListActivity.this.u;
                    if (f < 0.0f) {
                        f = 0.0f;
                    }
                    if (f > 1.0f) {
                        f = 1.0f;
                    }
                    ah.a(BaseUserCommentListActivity.this.l, f);
                    ah.a(BaseUserCommentListActivity.this.m, 1.0f - f);
                }
                if (i <= 0 || i2 <= 0 || i + i2 < i3 - 1) {
                    return;
                }
                BaseUserCommentListActivity.this.h();
            }
        });
        this.k = findViewById(R.id.layout_add_comment);
        this.o = (EditText) findViewById(R.id.edit_add_comment);
        this.n = (TextView) findViewById(R.id.btn_submit);
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.sankuai.waimai.business.user.comment.BaseUserCommentListActivity.4
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9fa31107eea819d1cd0a4002659d7fb2", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9fa31107eea819d1cd0a4002659d7fb2");
                } else {
                    BaseUserCommentListActivity.this.g();
                }
            }
        };
        this.f = new d(this, (int) R.id.layout_my_comment_empty);
        this.f.b(onClickListener2);
        this.f.a(17170443);
        this.f.a(R.drawable.waimai_c_no_comment, R.string.wm_comment_no_content, 0, R.string.wm_comment_go_to_comment, new View.OnClickListener() { // from class: com.sankuai.waimai.business.user.comment.BaseUserCommentListActivity.5
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "be871a598fd40ddab9e8c9eefbe370ec", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "be871a598fd40ddab9e8c9eefbe370ec");
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putInt("fragment_id", 3);
                com.sankuai.waimai.foundation.router.a.a(BaseUserCommentListActivity.this, c.B, bundle2);
                BaseUserCommentListActivity.this.finish();
            }
        });
        this.e = new d(this, (int) R.id.layout_my_comment_refresh);
        this.e.a(onClickListener2);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10a3f81a86b6487e8a7b27e7004369cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10a3f81a86b6487e8a7b27e7004369cb");
        } else {
            super.onBackPressed();
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8540a559ac2c521ede338c0d587f55c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8540a559ac2c521ede338c0d587f55c5");
        } else {
            a(0, this.b > 0);
        }
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c72fc014c0566858297319065c8540c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c72fc014c0566858297319065c8540c2");
        } else {
            b(0);
        }
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bceff057d614a96d8a450b4e3c372510", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bceff057d614a96d8a450b4e3c372510");
        } else if (this.c) {
            b(this.b + 1);
        }
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f873fdfd52daf9101152be64eeae6b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f873fdfd52daf9101152be64eeae6b5");
        } else {
            a(i, false);
        }
    }

    private void a(final int i, final boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2baea74e5f34b6a381063ecc722f7cba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2baea74e5f34b6a381063ecc722f7cba");
        } else if (this.d) {
        } else {
            this.d = true;
            b.a(((CommentApi) b.a((Class<Object>) CommentApi.class)).getMyCommentList(i * 20, 20, i(), this.F), new b.AbstractC1042b<BaseResponse<MyCommentResponse>>() { // from class: com.sankuai.waimai.business.user.comment.BaseUserCommentListActivity.6
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8da0cab16c5c695235e1a8660c11795c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8da0cab16c5c695235e1a8660c11795c");
                    } else if (baseResponse == null) {
                        onError(null);
                    } else {
                        BaseUserCommentListActivity.this.d = false;
                        if (com.sankuai.waimai.platform.domain.manager.bubble.a.a().e) {
                            com.sankuai.waimai.platform.domain.manager.bubble.a.a().b();
                        }
                        if (BaseUserCommentListActivity.this.bB_().isFinishing()) {
                            return;
                        }
                        BaseUserCommentListActivity.this.v();
                        BaseUserCommentListActivity.this.e.h();
                        BaseUserCommentListActivity.this.f.h();
                        BaseUserCommentListActivity.this.c = false;
                        if (!TextUtils.isEmpty(com.sankuai.waimai.platform.capacity.network.errorhanding.b.a(BaseUserCommentListActivity.this.bB_(), baseResponse))) {
                            if (BaseUserCommentListActivity.this.j.isEmpty()) {
                                BaseUserCommentListActivity.this.f.d(baseResponse.msg);
                                return;
                            } else {
                                BaseUserCommentListActivity.this.b_(baseResponse.msg);
                                return;
                            }
                        }
                        BaseUserCommentListActivity.this.t = (MyCommentResponse) baseResponse.data;
                        if (BaseUserCommentListActivity.this.t != null) {
                            boolean z2 = BaseUserCommentListActivity.this.t.g;
                            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                            a2.b = BaseUserCommentListActivity.this.bB_();
                            a2.c = BaseUserCommentListActivity.this.t.d;
                            b.C0608b b = a2.b(R.dimen.wm_comment_user_header_avatar_size);
                            b.f = ImageQualityUtil.a(0);
                            b.C0608b a3 = b.a(new RoundAndCenterCropTransform((Context) BaseUserCommentListActivity.this, true));
                            a3.i = R.drawable.wm_comment_avatar_default;
                            a3.a(BaseUserCommentListActivity.this.p);
                            BaseUserCommentListActivity.this.a(BaseUserCommentListActivity.this.t.b);
                            BaseUserCommentListActivity.this.s = BaseUserCommentListActivity.this.t.e;
                            BaseUserCommentListActivity.this.q.setText(BaseUserCommentListActivity.this.s);
                            boolean z3 = BaseUserCommentListActivity.this.t.h == 1;
                            BaseUserCommentListActivity.this.D.setVisibility(z3 ? 0 : 8);
                            if (z3) {
                                String b2 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(BaseUserCommentListActivity.this.bB_(), "vip_icon", "");
                                if (TextUtils.isEmpty(b2)) {
                                    BaseUserCommentListActivity.this.D.setImageResource(R.drawable.wm_user_ic_vip);
                                } else {
                                    b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
                                    c.j = R.drawable.wm_user_ic_vip;
                                    c.i = R.drawable.wm_user_ic_vip;
                                    c.e = 1;
                                    c.c = b2;
                                    c.a(BaseUserCommentListActivity.this.D);
                                }
                            }
                            BaseUserCommentListActivity.this.l.setText(BaseUserCommentListActivity.this.d());
                            if (BaseUserCommentListActivity.this.t.f != null && !BaseUserCommentListActivity.this.t.f.isEmpty()) {
                                if (i == 0) {
                                    a aVar = BaseUserCommentListActivity.this.j;
                                    ArrayList<Comment> arrayList = BaseUserCommentListActivity.this.t.f;
                                    Object[] objArr3 = {arrayList};
                                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "f7b8220e0003b8662dac73b23bb61cb4", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "f7b8220e0003b8662dac73b23bb61cb4");
                                    } else {
                                        aVar.b.clear();
                                        aVar.a(arrayList);
                                    }
                                    StatisticsListView statisticsListView = BaseUserCommentListActivity.this.i;
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = StatisticsListView.a;
                                    if (PatchProxy.isSupport(objArr4, statisticsListView, changeQuickRedirect4, false, "eded783a180cda82b5207512349ef176", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, statisticsListView, changeQuickRedirect4, false, "eded783a180cda82b5207512349ef176");
                                    } else {
                                        statisticsListView.b.a();
                                    }
                                } else {
                                    BaseUserCommentListActivity.this.j.a(BaseUserCommentListActivity.this.t.f);
                                }
                                BaseUserCommentListActivity.this.b = i;
                                BaseUserCommentListActivity.this.c = BaseUserCommentListActivity.this.t.c;
                                if (z) {
                                    BaseUserCommentListActivity.this.i.smoothScrollToPosition(0);
                                }
                                if (BaseUserCommentListActivity.this.E) {
                                    BaseUserCommentListActivity.a(BaseUserCommentListActivity.this, false);
                                }
                            } else if (BaseUserCommentListActivity.this.j.isEmpty()) {
                                BaseUserCommentListActivity.this.f.f();
                                BaseUserCommentListActivity.this.f.c().setVisibility(z2 ? 0 : 8);
                                if (BaseUserCommentListActivity.this.E) {
                                    BaseUserCommentListActivity.a(BaseUserCommentListActivity.this, false);
                                }
                            }
                        }
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf3c3b33c23a8ebbba964375f3623e29", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf3c3b33c23a8ebbba964375f3623e29");
                        return;
                    }
                    BaseUserCommentListActivity.this.d = false;
                    BaseUserCommentListActivity.this.v();
                    if (BaseUserCommentListActivity.this.j.isEmpty()) {
                        BaseUserCommentListActivity.this.e.g();
                    } else {
                        com.sankuai.waimai.platform.capacity.network.errorhanding.b.a(BaseUserCommentListActivity.this, (Throwable) null);
                    }
                }
            }, w());
            if (this.j.isEmpty()) {
                this.e.d();
            }
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6b91de1901d8e49e5a3e4d96c7ee5c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6b91de1901d8e49e5a3e4d96c7ee5c4");
        } else {
            this.r.setText(bB_().getString(R.string.wm_comment_my_comment_count, new Object[]{Integer.valueOf(i)}));
        }
    }

    @Override // com.sankuai.waimai.business.user.comment.adapter.a.InterfaceC0880a
    public final void a(ArrayList<Picture> arrayList, int i) {
        Object[] objArr = {arrayList, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7232e880f3d4ea547e1ed28975fcf991", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7232e880f3d4ea547e1ed28975fcf991");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("images", arrayList);
        bundle.putInt("current_img_path", i);
        com.sankuai.waimai.foundation.router.a.a(this, c.A, bundle);
    }
}
