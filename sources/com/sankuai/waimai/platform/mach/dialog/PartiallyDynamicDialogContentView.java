package com.sankuai.waimai.platform.mach.dialog;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PartiallyDynamicDialogContentView extends d {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ImageView backgroundImageView;
    private View bottomCenterButton;
    private View contentContainer;
    private DialogFooterView footerView;
    private DialogHeaderView headerView;
    public boolean mIsFromTop;
    private MultiModuleItemView moduleView;
    private View.OnClickListener onCloseButtonClickListener;
    private View topRightButton;
    private FrameLayout topRightContainer;

    public PartiallyDynamicDialogContentView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8fad2cc6758f2d39559d29f1c4dc82c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8fad2cc6758f2d39559d29f1c4dc82c");
        } else {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
    }

    public PartiallyDynamicDialogContentView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7836a3443c928ff83013a776191886c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7836a3443c928ff83013a776191886c3");
            return;
        }
        this.mIsFromTop = false;
        this.onCloseButtonClickListener = new View.OnClickListener() { // from class: com.sankuai.waimai.platform.mach.dialog.PartiallyDynamicDialogContentView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b1b2110f895e7cc7e83678ec2ba6f8bb", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b1b2110f895e7cc7e83678ec2ba6f8bb");
                } else {
                    PartiallyDynamicDialogContentView.this.getDialogContext().a();
                }
            }
        };
        inflate(context, R.layout.wm_dynamic_dialog_skeleton_partially_dynamic_content_layout, this);
        initView();
    }

    private void initView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "965e6c0cb7be10df9f5e77fdce1e977f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "965e6c0cb7be10df9f5e77fdce1e977f");
            return;
        }
        this.backgroundImageView = (ImageView) findViewById(R.id.background);
        this.contentContainer = findViewById(R.id.content_container);
        this.headerView = (DialogHeaderView) findViewById(R.id.header_view);
        this.moduleView = (MultiModuleItemView) findViewById(R.id.module_view);
        this.footerView = (DialogFooterView) findViewById(R.id.footer_view);
        this.topRightContainer = (FrameLayout) findViewById(R.id.top_right_close_container);
        this.topRightButton = findViewById(R.id.top_right_close_button);
        this.bottomCenterButton = findViewById(R.id.bottom_center_close_button);
        this.topRightButton.setOnClickListener(this.onCloseButtonClickListener);
        this.bottomCenterButton.setOnClickListener(this.onCloseButtonClickListener);
    }

    public void setViewWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2bc7c2adead784b509d618e12798d20e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2bc7c2adead784b509d618e12798d20e");
            return;
        }
        if (this.contentContainer != null) {
            ViewGroup.LayoutParams layoutParams = this.contentContainer.getLayoutParams();
            layoutParams.width = i;
            this.contentContainer.setLayoutParams(layoutParams);
        }
        if (this.topRightContainer != null) {
            ViewGroup.LayoutParams layoutParams2 = this.topRightContainer.getLayoutParams();
            layoutParams2.width = i;
            this.topRightContainer.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.sankuai.waimai.platform.mach.dialog.d
    public void refresh(AlertInfo alertInfo, j jVar) {
        Object[] objArr = {alertInfo, jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "438c6bc1fe2ee6733f79c03416aa3dbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "438c6bc1fe2ee6733f79c03416aa3dbe");
        } else if (alertInfo != null) {
            if (this.mIsFromTop && alertInfo.modules != null) {
                for (AlertInfo.Module module : alertInfo.modules) {
                    module.layoutInfo = null;
                }
            }
            this.headerView.refresh(alertInfo.headerInfo);
            this.moduleView.refresh(alertInfo.modules, jVar);
            DialogFooterView dialogFooterView = this.footerView;
            AlertInfo.FooterInfo footerInfo = alertInfo.footerInfo;
            Object[] objArr2 = {footerInfo};
            ChangeQuickRedirect changeQuickRedirect3 = DialogFooterView.a;
            if (PatchProxy.isSupport(objArr2, dialogFooterView, changeQuickRedirect3, false, "4ce7a67fe1b1102068fefc792a0adee6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dialogFooterView, changeQuickRedirect3, false, "4ce7a67fe1b1102068fefc792a0adee6");
            } else if (footerInfo == null) {
                dialogFooterView.b.setVisibility(8);
            } else {
                dialogFooterView.b.setVisibility(0);
                dialogFooterView.setupButtonList(footerInfo.buttonList);
            }
            if (alertInfo.style != null) {
                setDialogBackground(alertInfo.style.background);
                setMaxListHeight(com.sankuai.waimai.foundation.utils.g.a(getContext(), alertInfo.style.contentMaxHeight));
                setupCloseButton(alertInfo.style.closeStyle);
            } else {
                setupCloseButton(0);
            }
            findViewById(R.id.shadow_background).setVisibility(this.mIsFromTop ? 0 : 8);
            findViewById(R.id.warrning_text).setVisibility(this.mIsFromTop ? 0 : 8);
            if (this.mIsFromTop) {
                this.headerView.setVisibility(8);
                this.footerView.setVisibility(8);
                setupCloseButton(0);
                ((ViewGroup.MarginLayoutParams) this.moduleView.getLayoutParams()).topMargin = com.sankuai.waimai.platform.capacity.immersed.a.a(getContext());
                ((ViewGroup.MarginLayoutParams) this.backgroundImageView.getLayoutParams()).bottomMargin = com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 5.0f);
                findViewById(R.id.module_footer_container).setPadding(0, com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 3.0f), 0, com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 10.0f));
            }
        } else {
            jVar.a();
        }
    }

    @Override // com.sankuai.waimai.platform.mach.dialog.c
    public void attachDialogContext(@NonNull DynamicDialog.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7265961bc90f88d3521a2428d4f60fea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7265961bc90f88d3521a2428d4f60fea");
            return;
        }
        super.attachDialogContext(dVar);
        this.headerView.attachDialogContext(dVar);
        this.moduleView.attachDialogContext(dVar);
        this.footerView.attachDialogContext(dVar);
    }

    private void setDialogBackground(AlertInfo.Style.Background background) {
        Object[] objArr = {background};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa04378208997d3b2393291c1b8aba34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa04378208997d3b2393291c1b8aba34");
        } else if (background == null) {
        } else {
            if (!TextUtils.isEmpty(background.backgroundUrl)) {
                b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a.b = getContext();
                a.c = background.backgroundUrl;
                a.a(this.backgroundImageView);
            }
            if (TextUtils.isEmpty(background.backgroundColor)) {
                return;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(ColorUtils.a(background.backgroundColor, -1));
            float a2 = com.sankuai.waimai.foundation.utils.g.a(getContext(), this.mIsFromTop ? 12.0f : 4.0f);
            gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, a2, a2, a2, a2});
            this.backgroundImageView.setBackground(gradientDrawable);
        }
    }

    private void setMaxListHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f9a88291f1856d5b17b28c0569acb0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f9a88291f1856d5b17b28c0569acb0f");
        } else if (i <= 0) {
        } else {
            this.moduleView.setMaxHeight(i);
        }
    }

    private void setupCloseButton(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a7cfe336abe8d7164762bef63a74bc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a7cfe336abe8d7164762bef63a74bc2");
        } else if (i == 2) {
            this.bottomCenterButton.setVisibility(8);
            this.topRightButton.setVisibility(0);
        } else if (i == 1) {
            this.bottomCenterButton.setVisibility(0);
            this.topRightButton.setVisibility(8);
        } else {
            this.bottomCenterButton.setVisibility(8);
            this.topRightButton.setVisibility(8);
        }
    }

    public View getCloseView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "144347c221cfe2e5564278b8a465e8a6", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "144347c221cfe2e5564278b8a465e8a6");
        }
        if (this.bottomCenterButton.getVisibility() == 0) {
            return this.bottomCenterButton;
        }
        if (this.topRightButton.getVisibility() == 0) {
            return this.topRightButton;
        }
        return null;
    }

    public View getContentView() {
        return this.contentContainer;
    }

    public void setCanceledOnTouchBg(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7130e33ba40b57508ca51106ee69dd28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7130e33ba40b57508ca51106ee69dd28");
        } else if (z) {
            setOnClickListener(this.onCloseButtonClickListener);
        }
    }
}
