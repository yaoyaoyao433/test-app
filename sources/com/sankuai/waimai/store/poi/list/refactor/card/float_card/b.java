package com.sankuai.waimai.store.poi.list.refactor.card.float_card;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.store.util.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    ViewGroup b;
    ImageView c;
    ImageView d;
    public TextView e;
    public TextView f;
    String g;
    int h;
    a i;
    int j;
    private int k;
    private ValueAnimator l;

    public static /* synthetic */ void a(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "aa2c6bde312f25451e8a4bb71bd57926", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "aa2c6bde312f25451e8a4bb71bd57926");
        } else if (bVar.i != a.CLOSE) {
            if (bVar.b.getMeasuredWidth() == 0) {
                bVar.b.measure(0, 0);
            }
            bVar.k = bVar.b.getMeasuredWidth();
            int a2 = bVar.a();
            int measuredWidth = (bVar.c.getMeasuredWidth() + g.a(bVar.mContext, 8.0f)) - bVar.k;
            if (bVar.l == null || !bVar.l.isRunning()) {
                bVar.l = ValueAnimator.ofInt(a2, measuredWidth);
                bVar.l.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.float_card.b.3
                    public static ChangeQuickRedirect a;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Object[] objArr2 = {valueAnimator};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1e6038634c96adb1ca887d9c97e08207", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1e6038634c96adb1ca887d9c97e08207");
                        } else {
                            b.this.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
                        }
                    }
                });
                bVar.l.addListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.float_card.b.4
                    public static ChangeQuickRedirect a;

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        Object[] objArr2 = {animator};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f51cdfa806296c01dc9b58bbbec4fa8d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f51cdfa806296c01dc9b58bbbec4fa8d");
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                    }
                });
                bVar.l.setDuration(300L);
                bVar.l.start();
                bVar.i = a.CLOSE;
            }
        }
    }

    public static /* synthetic */ void b(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "2dc225c9c7a9be7a79e3136f90f34acd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "2dc225c9c7a9be7a79e3136f90f34acd");
        } else if (t.a(bVar.g)) {
        } else {
            com.sankuai.waimai.store.router.d.a(bVar.getContext(), bVar.g);
            com.sankuai.waimai.store.manager.judas.b.a(bVar.getContext(), "b_9UfLn").a("has_message", Integer.valueOf(bVar.h > 0 ? 1 : 0)).a();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public enum a {
        OPEN,
        CLOSE;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0129ebb1d21ad1e83debda46de1d6292", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0129ebb1d21ad1e83debda46de1d6292");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7b614b5ad80d310b5a39a80a4613cfc", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7b614b5ad80d310b5a39a80a4613cfc") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d89164358ff55397ea039fce034aa2f", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d89164358ff55397ea039fce034aa2f") : (a[]) values().clone();
        }
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c74f6e96b6be572d3a66a26d41b764d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c74f6e96b6be572d3a66a26d41b764d0");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21e58103b75b6828fec9cda982e116f3", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21e58103b75b6828fec9cda982e116f3") : layoutInflater.inflate(R.layout.wm_st_page_order_status_layout, viewGroup, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8158c29ef7df48c21196d34938c6a82", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8158c29ef7df48c21196d34938c6a82")).intValue() : ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).rightMargin;
    }

    public final void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be66b63e7067458ab97dc4cbcb751be3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be66b63e7067458ab97dc4cbcb751be3");
        } else if (this.i == a.OPEN) {
        } else {
            if (this.b.getMeasuredWidth() == 0) {
                this.b.measure(0, 0);
            }
            this.k = this.b.getMeasuredWidth();
            int a2 = z2 ? a() : -this.k;
            int i = this.j;
            if (this.l == null || !this.l.isRunning()) {
                if (z) {
                    this.l = ValueAnimator.ofInt(a2, i);
                    this.l.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.float_card.b.1
                        public static ChangeQuickRedirect a;

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Object[] objArr2 = {valueAnimator};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8af75710338a7e79d552b7a53c9c9433", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8af75710338a7e79d552b7a53c9c9433");
                            } else {
                                b.this.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
                            }
                        }
                    });
                    this.l.addListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.float_card.b.2
                        public static ChangeQuickRedirect a;

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            Object[] objArr2 = {animator};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c1184e6e918287fd0559de13a8cc5c7c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c1184e6e918287fd0559de13a8cc5c7c");
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationRepeat(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                        }
                    });
                    this.l.setDuration(300L);
                    if (this.i == null) {
                        this.l.setInterpolator(new OvershootInterpolator());
                    }
                    this.l.start();
                } else {
                    a(i);
                }
                this.i = a.OPEN;
            }
        }
    }

    void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbdf52140c46dbd9bfcc8789efa39660", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbdf52140c46dbd9bfcc8789efa39660");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
        marginLayoutParams.rightMargin = i;
        this.b.setLayoutParams(marginLayoutParams);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ed3ae06ba3e9f8d4fed85a3224ca88a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ed3ae06ba3e9f8d4fed85a3224ca88a");
            return;
        }
        super.onViewCreated();
        this.b = (ViewGroup) findView(R.id.layout_container);
        this.c = (ImageView) findView(R.id.img_status);
        this.b.setBackground(new e.a().a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{ContextCompat.getColor(getContext(), R.color.wm_sg_color_FFB500), ContextCompat.getColor(getContext(), R.color.wm_sg_color_FFD161)}).a(com.sankuai.waimai.store.util.b.c(getContext(), R.dimen.wm_sc_common_dimen_34)).a());
        ImageView imageView = this.c;
        e.a aVar = new e.a();
        Object[] objArr2 = {1};
        ChangeQuickRedirect changeQuickRedirect2 = e.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "9dc91fd05e0b104710d1217ebaca70d1", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (e.a) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "9dc91fd05e0b104710d1217ebaca70d1");
        } else {
            aVar.b.j = 1;
        }
        imageView.setBackground(aVar.b(2).a(com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sc_white_3)).a());
        this.d = (ImageView) findView(R.id.img_bottom_status_close);
        this.e = (TextView) findView(R.id.txt_bottom_status_main);
        this.f = (TextView) findView(R.id.txt_bottom_status_second);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.float_card.b.5
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "003590b83828983deec79aa2a9702930", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "003590b83828983deec79aa2a9702930");
                } else {
                    b.a(b.this);
                }
            }
        });
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.float_card.b.6
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "784a32aeada6565c82eebf007c601570", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "784a32aeada6565c82eebf007c601570");
                } else if (b.this.i == a.CLOSE) {
                    b.this.a(true, true);
                } else if (b.this.i == a.OPEN) {
                    b.b(b.this);
                }
            }
        });
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.float_card.b.7
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "673aa34b036ee4833145b96661e870bd", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "673aa34b036ee4833145b96661e870bd");
                } else if (b.this.i == a.OPEN) {
                    b.b(b.this);
                }
            }
        });
        this.j = a();
        u.b(this.b);
    }
}
