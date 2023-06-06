package com.dianping.shield.component.extensions.tabs;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.dianping.agentsdk.framework.aq;
import com.dianping.picassomodule.utils.b;
import com.dianping.picassomodule.widget.tab.h;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.itemcallbacks.ViewPaintingCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.unionpay.tsmservice.mi.data.Constant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.f;
import kotlin.o;
import kotlin.text.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002()B\u0005¢\u0006\u0002\u0010\u0003J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J$\u0010\u0018\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0002J\b\u0010\u001d\u001a\u00020\u001eH&J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005H\u0002J\u0018\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/dianping/shield/component/extensions/tabs/CommonTabRowPaintingCallback;", "Lcom/dianping/shield/node/itemcallbacks/ViewPaintingCallback;", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "()V", "DEFAULT_NORMAL_COLOR", "", "DEFAULT_SELECTED_COLOR_DP", "DEFAULT_TEXT_SIZE", "", "context", "Landroid/content/Context;", DMKeys.KEY_TAB_SELECTED_TITLE_COLOR, "selectedTitleSize", "selectedTypeFace", "titleColor", Constant.KEY_TITLE_SIZE, "typeface", "bindViewHolder", "", "viewHolder", "data", "", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "createViewHolder", "parent", "Landroid/view/ViewGroup;", DMKeys.KEY_VIEW_TYPE, "getDefaultSelectedColor", "getTitleInfo", "Lcom/dianping/picassomodule/widget/tab/TabTitleInfo;", "makeSelector", "Landroid/content/res/ColorStateList;", "normalColor", "selectedColor", "makeUpTextView", "titleTx", "Landroid/widget/TextView;", DMKeys.KEY_SELECTED, "", "CommonTabData", "CommonTabShieldViewHolder", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class CommonTabRowPaintingCallback implements ViewPaintingCallback<ShieldViewHolder> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String DEFAULT_NORMAL_COLOR;
    private final String DEFAULT_SELECTED_COLOR_DP;
    private final int DEFAULT_TEXT_SIZE;
    private Context context;
    private String selectedTitleColor;
    private int selectedTitleSize;
    private int selectedTypeFace;
    private String titleColor;
    private int titleSize;
    private int typeface;

    @NotNull
    public abstract h getTitleInfo();

    public CommonTabRowPaintingCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ec780f13a1d335b33afd075ea4c21ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ec780f13a1d335b33afd075ea4c21ca");
            return;
        }
        this.DEFAULT_NORMAL_COLOR = "#333333";
        this.DEFAULT_SELECTED_COLOR_DP = "#FF6633";
        this.DEFAULT_TEXT_SIZE = 14;
        this.titleColor = this.DEFAULT_NORMAL_COLOR;
        this.selectedTitleColor = getDefaultSelectedColor();
        this.titleSize = this.DEFAULT_TEXT_SIZE;
        this.selectedTitleSize = this.DEFAULT_TEXT_SIZE;
    }

    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    @NotNull
    public ShieldViewHolder createViewHolder(@NotNull Context context, @Nullable ViewGroup viewGroup, @Nullable String str) {
        Object[] objArr = {context, viewGroup, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "846f4129af144213f9c4d78d657e8510", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldViewHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "846f4129af144213f9c4d78d657e8510");
        }
        kotlin.jvm.internal.h.b(context, "context");
        this.context = context;
        h titleInfo = getTitleInfo();
        int m = titleInfo.m();
        if (titleInfo.m() == 0) {
            List<String> d = titleInfo.d();
            m = d != null ? d.size() : 0;
        }
        if (m == 0) {
            return new ShieldViewHolder(new View(context));
        }
        String k = titleInfo.k();
        if (k != null && g.b(k, "#", false)) {
            this.titleColor = k;
        }
        String l = titleInfo.l();
        if (l != null && g.b(l, "#", false)) {
            this.selectedTitleColor = l;
        }
        this.titleSize = titleInfo.g() == 0 ? this.DEFAULT_TEXT_SIZE : titleInfo.g();
        this.selectedTitleSize = titleInfo.h() == 0 ? this.titleSize : titleInfo.h();
        this.typeface = titleInfo.i() == 0 ? 0 : titleInfo.i();
        this.selectedTypeFace = titleInfo.j() != 0 ? titleInfo.j() : 0;
        FrameLayout frameLayout = new FrameLayout(context);
        int a = aq.a(context, titleInfo.f());
        int a2 = aq.a(context, titleInfo.a());
        int a3 = aq.a(context, titleInfo.b());
        int a4 = aq.a(context, titleInfo.c());
        if (a == 0) {
            a = (((aq.a(context) - (m * a2)) - a3) - a4) / m;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, aq.a(context, titleInfo.e()));
        layoutParams.rightMargin = a2;
        frameLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setMaxLines(1);
        frameLayout.addView(textView, layoutParams2);
        CommonTabShieldViewHolder commonTabShieldViewHolder = new CommonTabShieldViewHolder(frameLayout);
        commonTabShieldViewHolder.setTitleTx(textView);
        return commonTabShieldViewHolder;
    }

    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    public void bindViewHolder(@NotNull ShieldViewHolder shieldViewHolder, @Nullable Object obj, @Nullable NodePath nodePath) {
        Object[] objArr = {shieldViewHolder, obj, nodePath};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a4ab2b741b9869539f00d539ca8a113", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a4ab2b741b9869539f00d539ca8a113");
            return;
        }
        kotlin.jvm.internal.h.b(shieldViewHolder, "viewHolder");
        if (shieldViewHolder instanceof CommonTabShieldViewHolder) {
            CommonTabShieldViewHolder commonTabShieldViewHolder = (CommonTabShieldViewHolder) shieldViewHolder;
            if (commonTabShieldViewHolder.getTitleTx() instanceof TextView) {
                TextView titleTx = commonTabShieldViewHolder.getTitleTx();
                if (titleTx == null) {
                    throw new o("null cannot be cast to non-null type android.widget.TextView");
                }
                if (obj != null) {
                    titleTx.setText(((CommonTabData) obj).text);
                    makeUpTextView(titleTx, shieldViewHolder.itemView.isSelected());
                    h titleInfo = getTitleInfo();
                    int m = titleInfo.m();
                    if (titleInfo.m() == 0) {
                        List<String> d = titleInfo.d();
                        m = d != null ? d.size() : 0;
                    }
                    int a = aq.a(this.context, titleInfo.f());
                    int a2 = aq.a(this.context, titleInfo.a());
                    int a3 = aq.a(this.context, titleInfo.b());
                    int a4 = aq.a(this.context, titleInfo.c());
                    if (a == 0) {
                        a = (((aq.a(this.context) - (a2 * m)) - a3) - a4) / m;
                    }
                    ViewGroup.LayoutParams layoutParams = shieldViewHolder.itemView.getLayoutParams();
                    layoutParams.width = a;
                    shieldViewHolder.itemView.setLayoutParams(layoutParams);
                    return;
                }
                throw new o("null cannot be cast to non-null type com.dianping.shield.component.extensions.tabs.CommonTabRowPaintingCallback.CommonTabData");
            }
        }
    }

    private final void makeUpTextView(TextView textView, boolean z) {
        Object[] objArr = {textView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "899074f4d8ae36a10eac537f32f3cd86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "899074f4d8ae36a10eac537f32f3cd86");
            return;
        }
        textView.setTextColor(makeSelector(this.titleColor, this.selectedTitleColor));
        textView.setTextSize(2, z ? this.selectedTitleSize : this.titleSize);
        textView.setTypeface(Typeface.DEFAULT, z ? this.selectedTypeFace : this.typeface);
    }

    private final String getDefaultSelectedColor() {
        return this.DEFAULT_SELECTED_COLOR_DP;
    }

    private final ColorStateList makeSelector(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56e97acaee189e6b53e16d0cf60c2bde", RobustBitConfig.DEFAULT_VALUE) ? (ColorStateList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56e97acaee189e6b53e16d0cf60c2bde") : new ColorStateList(new int[][]{new int[]{16842913}, new int[]{16842919}, new int[0]}, new int[]{b.a(str2), b.a(str2), b.a(str)});
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/shield/component/extensions/tabs/CommonTabRowPaintingCallback$CommonTabData;", "", "text", "", "(Ljava/lang/String;)V", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class CommonTabData {
        public static ChangeQuickRedirect changeQuickRedirect;
        @JvmField
        @NotNull
        public String text;

        public CommonTabData() {
            this(null, 1, null);
        }

        public CommonTabData(@NotNull String str) {
            kotlin.jvm.internal.h.b(str, "text");
            this.text = str;
        }

        public /* synthetic */ CommonTabData(String str, int i, f fVar) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/dianping/shield/component/extensions/tabs/CommonTabRowPaintingCallback$CommonTabShieldViewHolder;", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "titleTx", "Landroid/widget/TextView;", "getTitleTx", "()Landroid/widget/TextView;", "setTitleTx", "(Landroid/widget/TextView;)V", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class CommonTabShieldViewHolder extends ShieldViewHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        @Nullable
        private TextView titleTx;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CommonTabShieldViewHolder(@NotNull View view) {
            super(view);
            kotlin.jvm.internal.h.b(view, "itemView");
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0a616e10d56dbaf9c5d2e5a7d3cb7ed", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0a616e10d56dbaf9c5d2e5a7d3cb7ed");
            }
        }

        @Nullable
        public final TextView getTitleTx() {
            return this.titleTx;
        }

        public final void setTitleTx(@Nullable TextView textView) {
            this.titleTx = textView;
        }
    }
}
