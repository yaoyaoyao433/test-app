package com.sankuai.android.share.common;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.constraint.R;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.util.j;
import com.meituan.android.sdkmanager.SDKInfoManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.interfaces.b;
import com.sankuai.android.share.interfaces.c;
import com.sankuai.android.share.interfaces.e;
import com.sankuai.android.share.util.h;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ShareDialog extends DialogFragment {
    public static ChangeQuickRedirect d;
    private RecyclerView a;
    private RecyclerView.a b;
    private View c;
    public b e;
    public boolean f;
    public boolean g;
    public a h;
    public e i;
    private Bitmap j;
    private ImageView k;
    private View l;
    private TextView m;
    private String n;
    private boolean o;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
        void a(DialogInterface dialogInterface, boolean z);
    }

    public static /* synthetic */ boolean a(ShareDialog shareDialog, boolean z) {
        shareDialog.f = true;
        return true;
    }

    @Override // android.support.v4.app.DialogFragment
    @NonNull
    public /* synthetic */ android.app.Dialog onCreateDialog(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "376c72d85315fbc860bd7ea65f7b6657", RobustBitConfig.DEFAULT_VALUE) ? (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "376c72d85315fbc860bd7ea65f7b6657") : new Dialog(getContext(), getTheme(), new DialogInterface.OnDismissListener() { // from class: com.sankuai.android.share.common.ShareDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Object[] objArr2 = {dialogInterface};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1249ba43d3cabe6d97242cd02d77bcc7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1249ba43d3cabe6d97242cd02d77bcc7");
                    return;
                }
                ShareDialog.a(ShareDialog.this, true);
                ShareDialog.this.c();
            }
        }, this.i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class c implements Runnable {
        public static ChangeQuickRedirect a;
        private final WeakReference<DialogFragment> b;

        private c(DialogFragment dialogFragment) {
            Object[] objArr = {dialogFragment};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be8dcb43f22bd4cb6f5c255bc9210242", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be8dcb43f22bd4cb6f5c255bc9210242");
            } else {
                this.b = new WeakReference<>(dialogFragment);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dd2fa6424fb40c3afefc66f122edf6f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dd2fa6424fb40c3afefc66f122edf6f");
                return;
            }
            DialogFragment dialogFragment = this.b.get();
            if (dialogFragment == null || dialogFragment.isDetached() || dialogFragment.getActivity() == null) {
                return;
            }
            SDKInfoManager.a aVar = new SDKInfoManager.a() { // from class: com.sankuai.android.share.common.ShareDialog.c.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.sdkmanager.SDKInfoManager.a
                public final void d(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "387333525a0e5d9dab7680f2acbda1d1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "387333525a0e5d9dab7680f2acbda1d1");
                        return;
                    }
                    DialogFragment dialogFragment2 = (DialogFragment) c.this.b.get();
                    if (dialogFragment2 == null || dialogFragment2.getActivity() == null) {
                        return;
                    }
                    dialogFragment2.dismiss();
                }

                @Override // com.meituan.android.sdkmanager.SDKInfoManager.a
                public final String b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c49aeca59b74c8babb56d642af5fbb7", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c49aeca59b74c8babb56d642af5fbb7");
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("standard", true);
                    } catch (JSONException unused) {
                    }
                    return jSONObject.toString();
                }
            };
            SDKInfoManager a2 = SDKInfoManager.a("share-sdk");
            FragmentActivity activity = dialogFragment.getActivity();
            Object[] objArr2 = {activity, "5.23.49", aVar};
            ChangeQuickRedirect changeQuickRedirect2 = SDKInfoManager.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "2fab3312ae431e0dd9566a0387338a00", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "2fab3312ae431e0dd9566a0387338a00");
                return;
            }
            Object[] objArr3 = {activity, "5.23.49", aVar};
            ChangeQuickRedirect changeQuickRedirect3 = SDKInfoManager.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "bf045bfda17c53e7600dd73f100c7cbe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "bf045bfda17c53e7600dd73f100c7cbe");
            } else {
                a2.a(activity, "5.23.49", 0, aVar);
            }
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "726c6b0e8a104558123932e9bb6e0341", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "726c6b0e8a104558123932e9bb6e0341");
            return;
        }
        super.onCreate(bundle);
        setStyle(0, R.style.share_ShareDialogTheme);
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cc68b83f9072e533b81e407ce486040", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cc68b83f9072e533b81e407ce486040");
        }
        View inflate = layoutInflater.inflate(R.layout.share_dialog_fragment, viewGroup, false);
        this.c = inflate;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eabb1ae8e225fc96ed5cc3daba57a71c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eabb1ae8e225fc96ed5cc3daba57a71c");
        } else if (this.c != null && this.c.findViewById(R.id.share_image) != null && this.c.findViewById(R.id.share_bg) != null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            translateAnimation.setDuration(200L);
            translateAnimation.setFillAfter(true);
            translateAnimation.setFillEnabled(true);
            translateAnimation.setInterpolator(getContext(), 17432582);
            this.c.findViewById(R.id.share_layout).startAnimation(translateAnimation);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(200L);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setFillEnabled(true);
            this.c.findViewById(R.id.share_bg).startAnimation(alphaAnimation);
            h.b = true;
        }
        return inflate;
    }

    public final void a(Bitmap bitmap, boolean z) {
        Object[] objArr = {bitmap, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fbf26257ac1f102fbf3861afaad5a05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fbf26257ac1f102fbf3861afaad5a05");
            return;
        }
        this.j = bitmap;
        this.o = z;
        if (this.k == null || this.l == null) {
            return;
        }
        a(bitmap);
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "277c95a033b0ef833a66334e00403b08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "277c95a033b0ef833a66334e00403b08");
            return;
        }
        this.n = str;
        d();
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dcb780a1e26a8ab2f28c0cf9144b49b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dcb780a1e26a8ab2f28c0cf9144b49b");
        } else if (this.m == null) {
        } else {
            if (!TextUtils.isEmpty(this.n)) {
                this.m.setVisibility(0);
                this.m.setText(b(this.n));
                return;
            }
            this.m.setVisibility(8);
        }
    }

    private void a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f18864e23443533c4997da8cde157d90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f18864e23443533c4997da8cde157d90");
        } else if (getActivity() == null || !isAdded()) {
        } else {
            if (bitmap == null) {
                this.k.setVisibility(8);
                this.l.setBackground(getResources().getDrawable(R.drawable.share_dialog_bg));
                return;
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.k.getLayoutParams();
            if (this.o) {
                Bitmap b2 = b(bitmap);
                if (b2 == null) {
                    return;
                }
                if (this.h != null) {
                    this.h.a();
                }
                layoutParams.width = -1;
                layoutParams.height = b2.getHeight();
                layoutParams.weight = 0.0f;
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                layoutParams.leftMargin = 0;
                layoutParams.rightMargin = 0;
                this.k.setImageBitmap(b2);
                this.k.setLayoutParams(layoutParams);
                this.k.setScaleType(ImageView.ScaleType.FIT_XY);
                this.k.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.android.share.common.ShareDialog.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8565261cc42499af3398fbb4a9d8c3e4", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8565261cc42499af3398fbb4a9d8c3e4");
                        } else if (ShareDialog.this.h != null) {
                            ShareDialog.this.h.b();
                        }
                    }
                });
                this.l.setBackground(new ColorDrawable(getResources().getColor(R.color.white)));
            } else {
                layoutParams.width = -2;
                layoutParams.height = 0;
                layoutParams.weight = 1.0f;
                layoutParams.topMargin = com.sankuai.android.share.common.util.b.a(getContext(), 8.0f);
                layoutParams.bottomMargin = com.sankuai.android.share.common.util.b.a(getContext(), 10.0f);
                layoutParams.leftMargin = com.sankuai.android.share.common.util.b.a(getContext(), 8.0f);
                layoutParams.rightMargin = com.sankuai.android.share.common.util.b.a(getContext(), 8.0f);
                this.k.setImageBitmap(bitmap);
                this.k.setLayoutParams(layoutParams);
                this.k.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.l.setBackground(getResources().getDrawable(R.drawable.share_dialog_bg));
            }
            this.k.setVisibility(0);
        }
    }

    private Bitmap b(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21e3fef27cc7f20f0b7a81bbe5cec9be", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21e3fef27cc7f20f0b7a81bbe5cec9be");
        }
        if (getContext() == null || bitmap == null || bitmap.getHeight() <= 0 || bitmap.getWidth() <= 0) {
            return null;
        }
        int a2 = com.sankuai.android.share.common.util.b.a(getContext(), 96.0f);
        float a3 = j.a(getContext()) / bitmap.getWidth();
        Matrix matrix = new Matrix();
        matrix.postScale(a3, a3);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        if (createBitmap == null || createBitmap.getHeight() <= a2) {
            return createBitmap;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, createBitmap.getHeight() - a2, createBitmap.getWidth(), a2, (Matrix) null, false);
        if (createBitmap != createBitmap2) {
            createBitmap.recycle();
        }
        return createBitmap2;
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1f38c7509d8b08877b4b24c0e83f0e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1f38c7509d8b08877b4b24c0e83f0e4");
            return;
        }
        super.onViewCreated(view, bundle);
        this.a = (RecyclerView) view.findViewById(R.id.share_recycle);
        this.a.setLayoutManager(new GridLayoutManager(getContext(), 5));
        if (this.b != null) {
            this.a.setAdapter(this.b);
        }
        this.k = (ImageView) view.findViewById(R.id.share_image);
        this.k.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.android.share.common.ShareDialog.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "893cb83b23bcd0d19b5396920fc53a12", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "893cb83b23bcd0d19b5396920fc53a12");
                }
            }
        });
        this.l = view.findViewById(R.id.share_bg_view);
        if (this.j != null) {
            a(this.j);
        }
        view.findViewById(R.id.share_bg).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.android.share.common.ShareDialog.4
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4543c83e1cd1ae5182f690687c7c252d", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4543c83e1cd1ae5182f690687c7c252d");
                    return;
                }
                if (ShareDialog.this.i != null) {
                    e unused = ShareDialog.this.i;
                    b.a aVar = b.a.INVALID;
                    c.a aVar2 = c.a.CANCEL;
                }
                ShareDialog.this.dismissAllowingStateLoss();
            }
        });
        view.findViewById(R.id.share_cancel).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.android.share.common.ShareDialog.5
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "782b0cd0446549a3d9435dcb976bf829", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "782b0cd0446549a3d9435dcb976bf829");
                    return;
                }
                if (ShareDialog.this.i != null) {
                    e unused = ShareDialog.this.i;
                    b.a aVar = b.a.INVALID;
                    c.a aVar2 = c.a.CANCEL;
                }
                ShareDialog.this.dismissAllowingStateLoss();
            }
        });
        this.m = (TextView) view.findViewById(R.id.share_title);
        this.m.setOnClickListener(null);
        d();
        view.post(new c(this));
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9db838eae7d8852fff83d455a1395b47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9db838eae7d8852fff83d455a1395b47");
            return;
        }
        if (this.e != null) {
            this.e.a(dialogInterface, this.f);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // android.support.v4.app.DialogFragment
    public void dismissAllowingStateLoss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "785b84635ab83b2de74a31d4ddc62913", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "785b84635ab83b2de74a31d4ddc62913");
            return;
        }
        this.f = true;
        c();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "348693e05462656c92000816605a48bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "348693e05462656c92000816605a48bc");
            return;
        }
        this.f = false;
        c();
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17218af36ea0da8af70b4475dd253a9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17218af36ea0da8af70b4475dd253a9e");
            return;
        }
        super.dismissAllowingStateLoss();
        if (!this.g || getActivity() == null) {
            return;
        }
        getActivity().finish();
    }

    @Override // android.support.v4.app.DialogFragment
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e68c8f1651e7a86355a12e5f3857646e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e68c8f1651e7a86355a12e5f3857646e");
            return;
        }
        this.f = false;
        c();
    }

    public final void a(RecyclerView.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2baaecdbac85ac058269d9ab1dd76b12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2baaecdbac85ac058269d9ab1dd76b12");
            return;
        }
        this.b = aVar;
        if (this.a != null) {
            this.a.setAdapter(aVar);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04f941fdfd9f3e49c0b0aaa824f917b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04f941fdfd9f3e49c0b0aaa824f917b9");
        } else if (this.c == null || this.c.findViewById(R.id.share_layout) == null || this.c.findViewById(R.id.share_bg) == null) {
        } else {
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            translateAnimation.setDuration(200L);
            translateAnimation.setFillAfter(true);
            translateAnimation.setFillEnabled(true);
            this.c.findViewById(R.id.share_layout).startAnimation(translateAnimation);
            translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.sankuai.android.share.common.ShareDialog.6
                public static ChangeQuickRedirect a;

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    Object[] objArr2 = {animation};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a02e72b93ca38491f899ef9a6bf62a92", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a02e72b93ca38491f899ef9a6bf62a92");
                    } else {
                        ShareDialog.this.a();
                    }
                }
            });
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(200L);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setFillEnabled(true);
            this.c.findViewById(R.id.share_bg).startAnimation(alphaAnimation);
            h.b = false;
        }
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "311a3e9ed31d3d9c6059098059c3e0c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "311a3e9ed31d3d9c6059098059c3e0c4");
        } else if (context instanceof FragmentActivity) {
            ProgressDialogFragment.a(((FragmentActivity) context).getSupportFragmentManager());
        }
    }

    public static void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06a0d174ee9eb41b5193842030e3cfca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06a0d174ee9eb41b5193842030e3cfca");
        } else if (context instanceof FragmentActivity) {
            ProgressDialogFragment.b(((FragmentActivity) context).getSupportFragmentManager());
        }
    }

    private Spanned b(String str) {
        Spanned fromHtml;
        Object[] spans;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08f0413d860d8f5bb395fe908baf15cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Spanned) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08f0413d860d8f5bb395fe908baf15cc");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            fromHtml = Html.fromHtml(str, 0);
        } else {
            fromHtml = Html.fromHtml(str);
        }
        if ((fromHtml instanceof SpannableStringBuilder) && (spans = fromHtml.getSpans(0, str.length(), Object.class)) != null) {
            for (Object obj : spans) {
                if (!(obj instanceof ForegroundColorSpan)) {
                    ((SpannableStringBuilder) fromHtml).removeSpan(obj);
                }
            }
        }
        return fromHtml;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class Dialog extends android.app.Dialog {
        public static ChangeQuickRedirect a;
        private DialogInterface.OnDismissListener b;
        private e c;

        public Dialog(@NonNull Context context, @StyleRes int i, DialogInterface.OnDismissListener onDismissListener, e eVar) {
            super(context, i);
            Object[] objArr = {context, Integer.valueOf(i), onDismissListener, eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff6f42c35541e3afd8e293f489483c59", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff6f42c35541e3afd8e293f489483c59");
                return;
            }
            this.b = onDismissListener;
            this.c = eVar;
        }

        @Override // android.app.Dialog, android.content.DialogInterface
        public void cancel() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac2747070779f738d9eb92adb0264a3b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac2747070779f738d9eb92adb0264a3b");
            } else if (this.b != null) {
                this.b.onDismiss(this);
            } else {
                super.cancel();
            }
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1db2bd61bb797d0c40b3af60d9a9d647", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1db2bd61bb797d0c40b3af60d9a9d647");
                return;
            }
            if (this.c != null) {
                b.a aVar = b.a.INVALID;
                c.a aVar2 = c.a.CANCEL;
            }
            super.onBackPressed();
        }
    }
}
