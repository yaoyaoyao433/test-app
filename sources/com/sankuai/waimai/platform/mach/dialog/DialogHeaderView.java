package com.sankuai.waimai.platform.mach.dialog;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import com.sankuai.waimai.platform.mach.lottieextend.MachSafeLottieAnimView;
import com.squareup.picasso.PicassoGifDrawable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class DialogHeaderView extends c {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ViewGroup headerContainer;
    private ImageView ivHeadImg;
    private MachSafeLottieAnimView mLottieAnimView;

    public DialogHeaderView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f7735041db597933c21d4596dc20dfd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f7735041db597933c21d4596dc20dfd");
        } else {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
    }

    public DialogHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78b1614d6e35a7aa2b82112bfd208623", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78b1614d6e35a7aa2b82112bfd208623");
            return;
        }
        inflate(context, R.layout.wm_dynamic_dialog_skeleton_header_layout, this);
        this.ivHeadImg = (ImageView) findViewById(R.id.iv_head_img);
        this.mLottieAnimView = (MachSafeLottieAnimView) findViewById(R.id.iv_head_lottie);
        this.headerContainer = (ViewGroup) findViewById(R.id.header_container);
    }

    public void refresh(AlertInfo.HeaderInfo headerInfo) {
        Object[] objArr = {headerInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ca1876e3567215efc9bb91ef29a0920", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ca1876e3567215efc9bb91ef29a0920");
        } else if (headerInfo == null || !canShow()) {
            this.headerContainer.setVisibility(8);
        } else {
            this.headerContainer.setVisibility(0);
            this.ivHeadImg.setVisibility(8);
            this.mLottieAnimView.setVisibility(8);
            if (TextUtils.isEmpty(headerInfo.background)) {
                return;
            }
            if (isLottieUrl(headerInfo.background)) {
                setupLottieHeader(headerInfo);
            } else {
                setupImageHeader(headerInfo);
            }
        }
    }

    private void setupImageHeader(@NonNull final AlertInfo.HeaderInfo headerInfo) {
        Object[] objArr = {headerInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54d4c33fa2f984af89d354e9bacbb8d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54d4c33fa2f984af89d354e9bacbb8d9");
            return;
        }
        if (this.ivHeadImg.isLaidOut()) {
            loadImageOnSizeReady(this.ivHeadImg, headerInfo);
        } else {
            this.ivHeadImg.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.sankuai.waimai.platform.mach.dialog.DialogHeaderView.1
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "95053f55880215c77d98602f14087651", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "95053f55880215c77d98602f14087651")).booleanValue();
                    }
                    DialogHeaderView.this.ivHeadImg.getViewTreeObserver().removeOnPreDrawListener(this);
                    DialogHeaderView.this.loadImageOnSizeReady(DialogHeaderView.this.ivHeadImg, headerInfo);
                    return true;
                }
            });
        }
        setHeaderOnClickListener(this.ivHeadImg, headerInfo);
    }

    private void setupLottieHeader(@NonNull final AlertInfo.HeaderInfo headerInfo) {
        Object[] objArr = {headerInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53fdf5932f32d7f00ffec190de0a451e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53fdf5932f32d7f00ffec190de0a451e");
            return;
        }
        this.mLottieAnimView.setTemplateId("native_header_view");
        if (this.mLottieAnimView.isLaidOut()) {
            showLottie(headerInfo);
        } else {
            this.mLottieAnimView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.sankuai.waimai.platform.mach.dialog.DialogHeaderView.2
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "79a63891bac1b2e2b593dc16ec634e4e", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "79a63891bac1b2e2b593dc16ec634e4e")).booleanValue();
                    }
                    DialogHeaderView.this.mLottieAnimView.getViewTreeObserver().removeOnPreDrawListener(this);
                    DialogHeaderView.this.showLottie(headerInfo);
                    return true;
                }
            });
        }
        setHeaderOnClickListener(this.mLottieAnimView, headerInfo);
    }

    private boolean isLottieUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e0fbeecbcbb017e35f1c8c242ff3c27", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e0fbeecbcbb017e35f1c8c242ff3c27")).booleanValue() : str.endsWith("json.zip");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showLottie(final AlertInfo.HeaderInfo headerInfo) {
        Object[] objArr = {headerInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9795814ddaa09f6f1d60ff6db87afdd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9795814ddaa09f6f1d60ff6db87afdd5");
            return;
        }
        this.mLottieAnimView.getLayoutParams().height = this.headerContainer.getWidth() / 2;
        this.mLottieAnimView.requestLayout();
        com.sankuai.waimai.platform.mach.lottieextend.d.a().b();
        com.sankuai.waimai.platform.mach.lottieextend.d.a().a(this.mLottieAnimView, headerInfo.background);
        this.mLottieAnimView.setRepeatCount(-1);
        this.mLottieAnimView.a(new AnimatorListenerAdapter() { // from class: com.sankuai.waimai.platform.mach.dialog.DialogHeaderView.3
            public static ChangeQuickRedirect a;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                DynamicDialog.g l;
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ddae333626334abc6685e5a3f90a1230", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ddae333626334abc6685e5a3f90a1230");
                    return;
                }
                super.onAnimationStart(animator);
                DialogHeaderView.this.mLottieAnimView.setVisibility(0);
                DynamicDialog.d dialogContext = DialogHeaderView.this.getDialogContext();
                if (dialogContext == null || (l = dialogContext.l()) == null) {
                    return;
                }
                l.b(DialogHeaderView.this.ivHeadImg, headerInfo);
            }
        });
        this.mLottieAnimView.setIsAutoPlay(true);
        this.mLottieAnimView.setAnimStatus("start");
    }

    private void setHeaderOnClickListener(View view, final AlertInfo.HeaderInfo headerInfo) {
        Object[] objArr = {view, headerInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d7a7d0e6a4f8dd1fa7eca2d79fcc17f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d7a7d0e6a4f8dd1fa7eca2d79fcc17f");
        } else {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.mach.dialog.DialogHeaderView.4
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "740472c8dda27b0579df591c169bfbc3", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "740472c8dda27b0579df591c169bfbc3");
                    } else if (DialogHeaderView.this.getDialogContext().l() != null) {
                        DialogHeaderView.this.getDialogContext().l().a(view2, headerInfo);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadImageOnSizeReady(final ImageView imageView, final AlertInfo.HeaderInfo headerInfo) {
        Object[] objArr = {imageView, headerInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "368a505ceede9b95132d0184d23c2e98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "368a505ceede9b95132d0184d23c2e98");
            return;
        }
        b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
        a.b = getContext();
        a.c = headerInfo.background;
        a.a((View) imageView).b(imageView.getWidth(), imageView.getHeight()).a(new com.sankuai.meituan.mtimageloader.utils.b() { // from class: com.sankuai.waimai.platform.mach.dialog.DialogHeaderView.5
            public static ChangeQuickRedirect a;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
            public final void a(Drawable drawable) {
                Object[] objArr2 = {drawable};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b375c0ba05b5987fcdbd1d7f5e4529f3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b375c0ba05b5987fcdbd1d7f5e4529f3");
                    return;
                }
                imageView.setImageDrawable(drawable);
                if (drawable instanceof PicassoGifDrawable) {
                    ((PicassoGifDrawable) drawable).start();
                }
                imageView.setVisibility(0);
                if (DialogHeaderView.this.getDialogContext().l() != null) {
                    DialogHeaderView.this.getDialogContext().l().b(DialogHeaderView.this.ivHeadImg, headerInfo);
                }
            }

            @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bfea02af64d7989f950c5300dc651c63", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bfea02af64d7989f950c5300dc651c63");
                } else {
                    imageView.setVisibility(8);
                }
            }
        });
    }

    private boolean canShow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac2a62d351b1b7d7443fef5451e24118", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac2a62d351b1b7d7443fef5451e24118")).booleanValue() : com.sankuai.waimai.foundation.utils.g.c(getContext()) > com.sankuai.waimai.foundation.utils.g.a(getContext(), 535.0f);
    }
}
