package com.sankuai.waimai.store.drug.home.refactor.card.float_card.order;

import android.animation.ObjectAnimator;
import android.arch.lifecycle.q;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.GravityCompat;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.Utils;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.platform.capacity.imageloader.image.RoundAndCenterCropTransform;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.home.refactor.card.float_card.FloatCardViewModule;
import com.sankuai.waimai.store.drug.home.refactor.card.float_card.order.OrderMessageEntity;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    final com.sankuai.waimai.store.param.a b;
    OrderMessageEntity.LastOrderEntity c;
    final String d;
    private ImageView e;
    private TextView f;
    private TextView g;
    private boolean h;
    private int i;
    private CountDownTimer j;
    private boolean k;
    private SimpleDateFormat l;

    public a(@NonNull Context context, @NonNull com.sankuai.waimai.store.param.a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bffc5de255124fbeed48968888670044", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bffc5de255124fbeed48968888670044");
            return;
        }
        this.h = false;
        this.i = 0;
        this.k = false;
        this.b = aVar;
        this.d = com.sankuai.waimai.store.manager.judas.b.a((Object) this.mContext);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5894a01530e4d5211be442b955bb1288", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5894a01530e4d5211be442b955bb1288");
            return;
        }
        super.onViewCreated();
        LinearLayout linearLayout = (LinearLayout) getView();
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        int a2 = h.a(this.mContext, 12.0f);
        int a3 = h.a(this.mContext, 4.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, h.a(this.mContext, 41.0f));
        layoutParams.topMargin = a2;
        layoutParams.rightMargin = a2;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setBackground(new e.a().a(h.a(this.mContext, 22.0f)).a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-15539, -10931}).a());
        this.e = new ImageView(this.mContext);
        int a4 = h.a(this.mContext, 33.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(a4, a4);
        layoutParams2.leftMargin = a3;
        linearLayout.addView(this.e, layoutParams2);
        this.e.setOnClickListener(b.a(this));
        LinearLayout linearLayout2 = new LinearLayout(this.mContext);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(GravityCompat.START);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = a3;
        linearLayout.addView(linearLayout2, layoutParams3);
        this.f = new TextView(this.mContext);
        this.f.setTextSize(1, 12.0f);
        this.f.setTextColor(-14539738);
        this.f.setTypeface(Typeface.defaultFromStyle(1));
        linearLayout2.addView(this.f);
        this.g = new TextView(this.mContext);
        this.g.setTextColor(-14539738);
        this.g.setTextSize(1, 10.0f);
        linearLayout2.addView(this.g);
        linearLayout2.setOnClickListener(c.a(this));
        FrameLayout frameLayout = new FrameLayout(this.mContext);
        frameLayout.setPadding(a3 * 2, h.a(this.mContext, 14.5f), 0, 0);
        ViewGroup.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(h.a(this.mContext, 30.0f), -1);
        ImageView imageView = new ImageView(this.mContext);
        frameLayout.addView(imageView, new ViewGroup.LayoutParams(a2, a2));
        imageView.setImageDrawable(this.mContext.getDrawable(R.drawable.icon_drug_homepage_order_message_arow));
        linearLayout.addView(frameLayout, layoutParams4);
        frameLayout.setOnClickListener(d.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1afd665ab01a24b39e4eaa07132a669e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1afd665ab01a24b39e4eaa07132a669e");
            return;
        }
        if (this.c != null && !TextUtils.isEmpty(this.c.scheme)) {
            com.sankuai.waimai.store.router.d.a(this.mContext, this.c.scheme);
        }
        a(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f17c926859ca063506c09641c37e6d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f17c926859ca063506c09641c37e6d9");
        } else if (this.h) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab1386bb77cb537b7b368e1d80144fdf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab1386bb77cb537b7b368e1d80144fdf");
            } else {
                this.h = false;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getView(), RecceAnimUtils.TRANSLATION_X, this.i, 0.0f);
                ofFloat.setDuration(300L);
                ofFloat.setInterpolator(new OvershootInterpolator(0.0f));
                ofFloat.start();
            }
            a(0);
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9c02e7d07c2f83822dd67c9233c29cee", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9c02e7d07c2f83822dd67c9233c29cee");
            } else {
                this.h = true;
                int[] iArr = new int[2];
                this.e.getLocationInWindow(iArr);
                this.i = (h.a(this.mContext) - iArr[0]) - h.a(this.mContext, 37.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(getView(), RecceAnimUtils.TRANSLATION_X, 0.0f, this.i);
                ofFloat2.setDuration(300L);
                ofFloat2.setInterpolator(new OvershootInterpolator(0.0f));
                ofFloat2.start();
            }
            a(1);
        }
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d99f0e1c4a1163c754f5262c2f5fcffd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d99f0e1c4a1163c754f5262c2f5fcffd");
        } else if (this.c == null) {
        } else {
            String str = "b_waimai_16w9r4js_mc";
            Map<String, Object> a2 = a();
            if (i >= 0) {
                a2.put("type", Integer.valueOf(i));
                str = "b_waimai_m0nm17l6_mc";
            }
            com.sankuai.waimai.store.manager.judas.b.a(this.b.G, this.d, str).b(a2).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70a969919b1bbe9479f2dcfcdb7b5bb6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70a969919b1bbe9479f2dcfcdb7b5bb6");
        }
        HashMap hashMap = new HashMap();
        hashMap.put(RemoteMessageConst.MSGTYPE, Integer.valueOf(this.c.orderMessageType));
        hashMap.put("order_id", TextUtils.isEmpty(this.c.orderViewId) ? "" : this.c.orderViewId);
        hashMap.put("order_type", Integer.valueOf(this.c.orderType));
        return hashMap;
    }

    public final void a(@NonNull OrderMessageEntity.LastOrderEntity lastOrderEntity) {
        boolean z;
        boolean z2;
        Object[] objArr = {lastOrderEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c47eb53be56f55014f8c887274721b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c47eb53be56f55014f8c887274721b3");
            return;
        }
        lastOrderEntity.time *= 1000;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "23b0a2c3428ba91337c8daa362c6e087", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "23b0a2c3428ba91337c8daa362c6e087");
        } else if (!this.k) {
            this.k = true;
            com.sankuai.waimai.store.expose.v2.entity.a aVar = new com.sankuai.waimai.store.expose.v2.entity.a(this.e);
            Object[] objArr3 = {this};
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            aVar.a(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "97761e167c1de174d7d24b8ad7b32dbf", RobustBitConfig.DEFAULT_VALUE) ? (c.a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "97761e167c1de174d7d24b8ad7b32dbf") : new e(this));
            com.sankuai.waimai.store.expose.v2.b.a().a((SCBaseActivity) this.mContext, aVar);
        }
        m.a(lastOrderEntity.icon, h.a(this.mContext, 33.0f), h.a(this.mContext, 33.0f), ImageQualityUtil.c()).a(new RoundAndCenterCropTransform(this.mContext, h.a(this.mContext, 17.0f))).a(this.e);
        this.f.setText(lastOrderEntity.text);
        Object[] objArr4 = {lastOrderEntity};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1824443a18a2909529fe6da092fd7180", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1824443a18a2909529fe6da092fd7180")).booleanValue();
        } else {
            z = lastOrderEntity.time > 0 && lastOrderEntity.timeType != 0;
        }
        if (!z) {
            b();
            this.g.setText(a(lastOrderEntity.subTextBeforeTime, lastOrderEntity.subTextAfterTime));
        } else {
            if ((lastOrderEntity.timeType == 1 || lastOrderEntity.timeType == 2) ? false : true) {
                b();
                a(lastOrderEntity, lastOrderEntity.time);
            } else {
                Object[] objArr5 = {lastOrderEntity};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "21779958474d2c6ad8e8ed51f225b7c9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "21779958474d2c6ad8e8ed51f225b7c9");
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis >= lastOrderEntity.time) {
                        b();
                        hide();
                    } else {
                        long j = lastOrderEntity.time - currentTimeMillis;
                        a(lastOrderEntity, j);
                        Object[] objArr6 = {lastOrderEntity};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "3f66ce6b555790e6b240516bc191a888", RobustBitConfig.DEFAULT_VALUE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "3f66ce6b555790e6b240516bc191a888")).booleanValue();
                        } else {
                            z2 = (this.c != null && this.c.time == lastOrderEntity.time && this.c.timeType == lastOrderEntity.timeType) ? false : true;
                        }
                        if (z2) {
                            Object[] objArr7 = {lastOrderEntity, new Long(j)};
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "aa092b9325538b0a7b8bdaac4e5e957b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "aa092b9325538b0a7b8bdaac4e5e957b");
                            } else {
                                b();
                                this.j = new CountDownTimer(j, lastOrderEntity.timeType == 1 ? 1000L : 60000L) { // from class: com.sankuai.waimai.store.drug.home.refactor.card.float_card.order.a.1
                                    public static ChangeQuickRedirect a;

                                    @Override // android.os.CountDownTimer
                                    public final void onTick(long j2) {
                                        Object[] objArr8 = {new Long(j2)};
                                        ChangeQuickRedirect changeQuickRedirect8 = a;
                                        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "ac5d9f987cef91edd32b5c1d21f3c348", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "ac5d9f987cef91edd32b5c1d21f3c348");
                                        } else {
                                            a.this.a(a.this.c, j2);
                                        }
                                    }

                                    @Override // android.os.CountDownTimer
                                    public final void onFinish() {
                                        Object[] objArr8 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect8 = a;
                                        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "eef2bd065c8143cc2502bc7aa5cf2c09", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "eef2bd065c8143cc2502bc7aa5cf2c09");
                                            return;
                                        }
                                        a.this.a(a.this.c, 0L);
                                        a.this.hide();
                                        if (com.sankuai.waimai.store.util.b.a(a.this.mContext)) {
                                            return;
                                        }
                                        ((FloatCardViewModule) q.a((FragmentActivity) ((SCBaseActivity) a.this.mContext)).a(FloatCardViewModule.class)).a((SCBaseActivity) a.this.mContext);
                                    }
                                };
                                this.j.start();
                            }
                        }
                    }
                }
            }
        }
        this.c = lastOrderEntity;
    }

    void a(OrderMessageEntity.LastOrderEntity lastOrderEntity, long j) {
        Object[] objArr = {lastOrderEntity, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de8ddbb41fdeb65699c5295316be87c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de8ddbb41fdeb65699c5295316be87c7");
        } else if (lastOrderEntity == null) {
        } else {
            String b = b(lastOrderEntity, j);
            if (TextUtils.isEmpty(lastOrderEntity.subTextBeforeTime) && TextUtils.isEmpty(lastOrderEntity.subTextAfterTime)) {
                this.g.setText(b);
                return;
            }
            SpannableString spannableString = new SpannableString(a(lastOrderEntity.subTextBeforeTime, b, lastOrderEntity.subTextAfterTime));
            int length = TextUtils.isEmpty(lastOrderEntity.subTextBeforeTime) ? 0 : lastOrderEntity.subTextBeforeTime.length();
            int length2 = b.length();
            spannableString.setSpan(new ForegroundColorSpan(-14539738), 0, length, 17);
            spannableString.setSpan(new ForegroundColorSpan(-46554), length, length2 + length, 17);
            this.g.setText(spannableString);
        }
    }

    private String a(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "436882418c0add65bff0ff11f1b473e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "436882418c0add65bff0ff11f1b473e3");
        }
        if (strArr.length > 0) {
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                }
            }
            return sb.toString();
        }
        return "";
    }

    @NonNull
    private String b(@NonNull OrderMessageEntity.LastOrderEntity lastOrderEntity, long j) {
        Object[] objArr = {lastOrderEntity, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ab32261c180d16443a9bab2f774a0ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ab32261c180d16443a9bab2f774a0ce");
        }
        String str = null;
        long j2 = 60;
        switch (lastOrderEntity.timeType) {
            case 1:
                long j3 = j / LocationStrategy.LOCATION_TIMEOUT;
                long j4 = (j - ((j3 * 1000) * 60)) / 1000;
                if (j4 != 0 || j3 <= 0) {
                    j2 = j4;
                } else {
                    j3--;
                }
                str = String.format(Locale.ENGLISH, "%02d:%02d", Long.valueOf(j3), Long.valueOf(j2));
                break;
            case 2:
                long j5 = j / DDLoadConstants.TIME_HOURS_MILLIS;
                long j6 = (j - (((1000 * j5) * 60) * 60)) / LocationStrategy.LOCATION_TIMEOUT;
                if (j6 != 0 || j5 <= 0) {
                    j2 = j6;
                } else {
                    j5--;
                }
                str = String.format(Locale.ENGLISH, "%02d小时%02d分", Long.valueOf(j5), Long.valueOf(j2));
                break;
            case 3:
                if (this.l == null) {
                    this.l = new SimpleDateFormat(Utils.SHORT_DATE_FORMAT, Locale.ENGLISH);
                }
                str = this.l.format(new Date(j));
                break;
        }
        return TextUtils.isEmpty(str) ? "00:00" : str;
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fee87e6bfde910cfe4600bf5bb1c892", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fee87e6bfde910cfe4600bf5bb1c892");
        } else if (this.j != null) {
            this.j.cancel();
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void hide() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "990e2047510b6fc92d33f954946f1dfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "990e2047510b6fc92d33f954946f1dfc");
            return;
        }
        u.c(getView());
        if (getView().getParent() == null || !(getView().getParent() instanceof LinearLayout)) {
            return;
        }
        u.d((LinearLayout) getView().getParent(), 0, 0, 0, h.a(this.mContext, 32.0f));
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "561e09be9cb78d98faed36e1bcb7da49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "561e09be9cb78d98faed36e1bcb7da49");
            return;
        }
        super.onDestroy();
        b();
    }

    public static /* synthetic */ void a(a aVar, View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "3d69f1df105ea54c08bad1c2939c51d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "3d69f1df105ea54c08bad1c2939c51d0");
        } else if (aVar.h) {
            aVar.b(view);
        } else {
            aVar.a(view);
        }
    }
}
