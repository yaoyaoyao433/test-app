package com.dianping.picassomodule.widget.normal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.agentsdk.framework.aq;
import com.dianping.shield.component.extensions.normal.NormalCellActionInfo;
import com.dianping.shield.component.extensions.normal.NormalConstant;
import com.dianping.shield.component.utils.TintColorUtil;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0002 !B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J*\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\b\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/dianping/picassomodule/widget/normal/NormalView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "actionContainer", "arrow", "Landroid/widget/ImageView;", "arrowWrapper", "Landroid/widget/FrameLayout;", "hasAddContent", "", "normalCellView", "createActionItem", "Landroid/view/View;", "onActionClickListener", "Lcom/dianping/shield/component/extensions/normal/NormalCellActionInfo$ActionClickListener;", "actionInfo", "Lcom/dianping/shield/component/extensions/normal/NormalCellActionInfo;", "buttonHeight", "", "margin", "hideActionLayer", "", "setNormalViewBuilder", "normalViewBuilder", "Lcom/dianping/picassomodule/widget/normal/NormalView$NormalViewInfo;", "showActionLayer", "updateActions", "Companion", "NormalViewInfo", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class a extends LinearLayout {
    public static ChangeQuickRedirect a;
    public static final C0113a b = new C0113a(null);
    private LinearLayout c;
    private LinearLayout d;
    private FrameLayout e;
    private ImageView f;
    private boolean g;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/dianping/picassomodule/widget/normal/NormalView$NormalViewInfo;", "", "()V", "actionInfoList", "Ljava/util/ArrayList;", "Lcom/dianping/shield/component/extensions/normal/NormalCellActionInfo;", "Lkotlin/collections/ArrayList;", DMKeys.KEY_ARROW_OFFSET, "", DMKeys.KEY_ARROW_POSITION_TYPE, DMKeys.KEY_ARROW_TINT_COLOR, "bottomPadding", "clipChildren", "", "contentView", "Landroid/view/View;", "imageArrowResId", "leftPadding", "onActionClickListener", "Lcom/dianping/shield/component/extensions/normal/NormalCellActionInfo$ActionClickListener;", "onActionViewShowListener", "Landroid/view/View$OnClickListener;", "rightPadding", DMKeys.KEY_SHOW_ARROW, "topPadding", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class b {
        @JvmField
        public boolean a = true;
        @JvmField
        public boolean b;
        @JvmField
        @Nullable
        public View c;
        @JvmField
        public int d;
        @JvmField
        public int e;
        @JvmField
        @Nullable
        public ArrayList<NormalCellActionInfo> f;
        @JvmField
        public int g;
        @JvmField
        public int h;
        @JvmField
        public int i;
        @JvmField
        public int j;
        @JvmField
        public int k;
        @JvmField
        public int l;
        @JvmField
        @Nullable
        public View.OnClickListener m;
        @JvmField
        @Nullable
        public NormalCellActionInfo.ActionClickListener n;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/dianping/picassomodule/widget/normal/NormalView$Companion;", "", "()V", "ACTION_BUTTON_HEIGHT", "", "ACTION_CORNER_RADIUS", "ACTION_IMAGE_BOTTOM_MARGIN", "ACTION_IMAGE_WIDTH_AND_HEIGHT", "ACTION_TEXT_SIZE", "CONTENTVIEW_WIDTH_WEIGHT", "HALF_ALPHA", "NO_ALPHA", "NO_ARROW_TINT_COLOR", "", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* renamed from: com.dianping.picassomodule.widget.normal.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0113a {
        public C0113a() {
        }

        public /* synthetic */ C0113a(f fVar) {
            this();
        }
    }

    public static final /* synthetic */ void a(a aVar, b bVar) {
        char c2 = 1;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "ee9cfde66ba181ed4e4a911ecaef50f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "ee9cfde66ba181ed4e4a911ecaef50f8");
            return;
        }
        aVar.d.setAlpha(0.5f);
        aVar.c.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = aVar.c.getLayoutParams();
        int width = aVar.d.getWidth();
        layoutParams.width = width;
        layoutParams.height = aVar.d.getHeight();
        aVar.c.setLayoutParams(layoutParams);
        aVar.c.removeAllViews();
        int a2 = aq.a(aVar.getContext(), 70.0f);
        if (aVar.d.getHeight() < a2) {
            a2 = aVar.d.getHeight();
        }
        int i = a2;
        ArrayList<NormalCellActionInfo> arrayList = bVar.f;
        int size = arrayList != null ? arrayList.size() : 0;
        char c3 = 2;
        int i2 = (width - (size * i)) / ((size + 1) * 2);
        ArrayList<NormalCellActionInfo> arrayList2 = bVar.f;
        if (arrayList2 != null) {
            for (NormalCellActionInfo normalCellActionInfo : arrayList2) {
                NormalCellActionInfo.ActionClickListener actionClickListener = bVar.n;
                Object[] objArr2 = new Object[4];
                objArr2[0] = actionClickListener;
                objArr2[c2] = normalCellActionInfo;
                objArr2[c3] = Integer.valueOf(i);
                objArr2[3] = Integer.valueOf(i2);
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "dac3ce28492ce9d71f39203e6c9e9747", RobustBitConfig.DEFAULT_VALUE)) {
                    View view = (View) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "dac3ce28492ce9d71f39203e6c9e9747");
                } else {
                    LinearLayout linearLayout = new LinearLayout(aVar.getContext());
                    linearLayout.setOrientation(1);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    if (normalCellActionInfo.getBackgroundColor() != 0) {
                        gradientDrawable.setColor(normalCellActionInfo.getBackgroundColor());
                    }
                    gradientDrawable.setCornerRadius(aq.a(aVar.getContext(), 35.0f));
                    linearLayout.setBackground(gradientDrawable);
                    linearLayout.setGravity(17);
                    if (normalCellActionInfo.getImageBitmap() != null || normalCellActionInfo.getImageDrawable() != null) {
                        ImageView imageView = new ImageView(aVar.getContext());
                        Drawable imageDrawable = normalCellActionInfo.getImageDrawable();
                        if (imageDrawable != null) {
                            imageView.setImageDrawable(imageDrawable);
                        }
                        Bitmap imageBitmap = normalCellActionInfo.getImageBitmap();
                        if (imageBitmap != null) {
                            imageView.setImageBitmap(imageBitmap);
                        }
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(aq.a(aVar.getContext(), 21.0f), aq.a(aVar.getContext(), 21.0f));
                        layoutParams2.bottomMargin = aq.a(aVar.getContext(), 3.5f);
                        linearLayout.addView(imageView, layoutParams2);
                    }
                    String title = normalCellActionInfo.getTitle();
                    if (!(title == null || title.length() == 0)) {
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                        TextView textView = new TextView(aVar.getContext());
                        textView.setText(normalCellActionInfo.getTitle());
                        textView.setTextColor(-1);
                        textView.setTextSize(1, 12.0f);
                        linearLayout.addView(textView, layoutParams3);
                    }
                    linearLayout.setLayoutParams(new LinearLayout.LayoutParams(i, i));
                    linearLayout.setOnClickListener(new c(actionClickListener, normalCellActionInfo));
                    ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
                    if (layoutParams4 == null) {
                        throw new o("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                    ((LinearLayout.LayoutParams) layoutParams4).leftMargin = i2;
                    ViewGroup.LayoutParams layoutParams5 = linearLayout.getLayoutParams();
                    if (layoutParams5 == null) {
                        throw new o("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                    ((LinearLayout.LayoutParams) layoutParams5).rightMargin = i2;
                    aVar.c.addView(linearLayout);
                }
                c2 = 1;
                c3 = 2;
            }
        }
    }

    public a(@Nullable Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e75284cdc9ca38676483bd0e5b2226ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e75284cdc9ca38676483bd0e5b2226ea");
        }
    }

    private a(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, null);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7ca7ac2775665a7d87530d382773f6c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7ca7ac2775665a7d87530d382773f6c");
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(frameLayout);
        this.d = new LinearLayout(getContext());
        this.d.setId(R.id.normal_cell_view);
        this.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.addView(this.d);
        this.e = new FrameLayout(getContext());
        this.e.setId(R.id.arrow_wrapper);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        this.e.setLayoutParams(layoutParams);
        this.d.addView(this.e);
        this.f = new ImageView(getContext());
        this.f.setId(R.id.arrow);
        this.f.setImageResource(R.drawable.shieldc_arrow);
        this.f.setLayoutParams(new FrameLayout.LayoutParams(aq.a(getContext(), 7.0f), -2));
        this.e.addView(this.f);
        this.c = new LinearLayout(getContext());
        this.c.setEnabled(false);
        this.c.setId(R.id.action_container);
        this.c.setOrientation(0);
        this.c.setGravity(17);
        this.c.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.addView(this.c);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    public final void setNormalViewBuilder(@NotNull b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dce16247001e146d244ae8fc75c013f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dce16247001e146d244ae8fc75c013f");
            return;
        }
        h.b(bVar, "normalViewBuilder");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        if (this.g) {
            this.d.removeView(this.d.getChildAt(0));
        }
        this.d.addView(bVar.c, 0, layoutParams);
        this.g = true;
        if (bVar.b) {
            this.e.setVisibility(0);
        } else {
            this.e.setVisibility(8);
        }
        boolean z = bVar.a;
        View view = bVar.c;
        while (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.setClipChildren(z);
            viewGroup.setClipToPadding(z);
            ViewParent parent = viewGroup.getParent();
            if (!(parent instanceof View)) {
                parent = null;
            }
            view = (View) parent;
        }
        if (bVar.e != 0) {
            TintColorUtil.setTintColor(this.f, bVar.e);
        }
        if (bVar.h == NormalConstant.ArrowPositionType.CellCenter.ordinal()) {
            setPadding(bVar.i, 0, bVar.j, 0);
            bVar.g *= 2;
            layoutParams.topMargin = bVar.k;
            layoutParams.bottomMargin = bVar.l;
        } else {
            setPadding(bVar.i, bVar.k, bVar.j, bVar.l);
            ViewGroup.LayoutParams layoutParams2 = this.e.getLayoutParams();
            if (layoutParams2 == null) {
                throw new o("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
            int i = bVar.h;
            if (i == NormalConstant.ArrowPositionType.ContentCenter.ordinal()) {
                layoutParams3.gravity = 16;
                bVar.g *= 2;
            } else if (i == NormalConstant.ArrowPositionType.ContentTop.ordinal()) {
                layoutParams3.gravity = 48;
            } else if (i == NormalConstant.ArrowPositionType.ContentBottom.ordinal()) {
                layoutParams3.gravity = 80;
            }
        }
        ViewGroup.LayoutParams layoutParams4 = this.f.getLayoutParams();
        if (layoutParams4 == null) {
            throw new o("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
        if (bVar.g >= 0) {
            layoutParams5.topMargin = bVar.g;
        } else {
            layoutParams5.bottomMargin = -bVar.g;
        }
        this.f.setLayoutParams(layoutParams5);
        if (bVar.d > 0) {
            this.f.setImageResource(bVar.d);
        }
        a(bVar);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/dianping/picassomodule/widget/normal/NormalView$updateActions$1$1"}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ b c;

        public d(b bVar) {
            this.c = bVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d35f070dfebd058bc8ef759b07767907", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d35f070dfebd058bc8ef759b07767907");
            } else {
                a.this.a();
            }
        }
    }

    private final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3f93f9d8840f062d629109bebb7bafb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3f93f9d8840f062d629109bebb7bafb");
            return;
        }
        ArrayList<NormalCellActionInfo> arrayList = bVar.f;
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next();
                this.c.setOnClickListener(new d(bVar));
                setOnLongClickListener(new e(bVar));
            }
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick", "com/dianping/picassomodule/widget/normal/NormalView$updateActions$1$2"}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class e implements View.OnLongClickListener {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ b c;

        public e(b bVar) {
            this.c = bVar;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa40866bee4711e8bc383578519e55b5", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa40866bee4711e8bc383578519e55b5")).booleanValue();
            }
            View.OnClickListener onClickListener = this.c.m;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            a.a(a.this, this.c);
            return true;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2407cee0f1be7575a02b79c86a549a1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2407cee0f1be7575a02b79c86a549a1e");
        } else if (this.c.getVisibility() == 0) {
            this.d.setAlpha(1.0f);
            this.c.setVisibility(8);
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.EventType.VIEW, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ NormalCellActionInfo.ActionClickListener c;
        public final /* synthetic */ NormalCellActionInfo d;

        public c(NormalCellActionInfo.ActionClickListener actionClickListener, NormalCellActionInfo normalCellActionInfo) {
            this.c = actionClickListener;
            this.d = normalCellActionInfo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2945da2d37f91ad11d9afbf1136f447c", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2945da2d37f91ad11d9afbf1136f447c");
                return;
            }
            a.this.a();
            NormalCellActionInfo.ActionClickListener actionClickListener = this.c;
            if (actionClickListener != null) {
                h.a((Object) view, Constants.EventType.VIEW);
                actionClickListener.onActionClick(view, this.d);
            }
        }
    }
}
