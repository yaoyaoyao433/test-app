package com.dianping.titans.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.dianping.titans.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBRuntime;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ComplexButton extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isIcon;
    private int mFallbackIconId;
    private View.OnClickListener mFallbackListener;
    private String mFallbackTitle;
    public ImageView mIv;
    private int mTextColor;
    private float mTextSize;
    public TextView mTv;
    public PerformClickListener performClickListener;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface PerformClickListener {
        void onPerformClick(View view);
    }

    public ComplexButton(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c0341ee3f04098ef095abbffb833717", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c0341ee3f04098ef095abbffb833717");
        }
    }

    public ComplexButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "268dcba8a65814692aa3b4a4b5b11ca7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "268dcba8a65814692aa3b4a4b5b11ca7");
        }
    }

    public ComplexButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4537b5223f7baa50a6cc6361c180d161", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4537b5223f7baa50a6cc6361c180d161");
            return;
        }
        this.mFallbackIconId = -1;
        this.mFallbackTitle = "";
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.textColor, R.attr.textSize});
        this.mTextColor = obtainStyledAttributes.getColor(0, getContext().getResources().getColor(R.color.knb_titlebar_action_hint_text_color));
        this.mTextSize = obtainStyledAttributes.getDimension(1, getContext().getResources().getDimension(R.dimen.text_size_15));
        obtainStyledAttributes.recycle();
        initView();
    }

    private void initView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22df8f93b5a112725147d0825c63b31e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22df8f93b5a112725147d0825c63b31e");
            return;
        }
        this.mTv = new TextView(getContext());
        this.mIv = new ImageView(getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        this.mTv.setLayoutParams(layoutParams);
        this.mIv.setLayoutParams(layoutParams);
        this.mTv.setTextSize(0, this.mTextSize);
        this.mTv.setTextColor(this.mTextColor);
        this.mTv.setGravity(16);
        this.mIv.setBackgroundColor(0);
        this.mIv.setScaleType(ImageView.ScaleType.CENTER);
        addView(this.mIv);
        addView(this.mTv);
    }

    public void setFallbackUi(String str, int i, View.OnClickListener onClickListener, boolean z) {
        Object[] objArr = {str, Integer.valueOf(i), onClickListener, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f43094de394c359c0da79c970c0b1bf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f43094de394c359c0da79c970c0b1bf0");
            return;
        }
        this.mFallbackIconId = i;
        this.mFallbackTitle = str;
        this.mFallbackListener = onClickListener;
        if (z) {
            fallbackUi();
        }
    }

    public void fallbackUi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f26f6221e2f76459cb29ee09f2ec6131", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f26f6221e2f76459cb29ee09f2ec6131");
            return;
        }
        if (this.mFallbackIconId != -1) {
            this.mIv.setVisibility(0);
            this.mTv.setVisibility(8);
            this.mIv.setImageResource(this.mFallbackIconId);
        } else if (!TextUtils.isEmpty(this.mFallbackTitle)) {
            this.mTv.setVisibility(0);
            this.mIv.setVisibility(8);
            this.mTv.setText(this.mFallbackTitle);
        } else {
            setVisibility(8);
        }
        if (this.mFallbackListener != null) {
            setOnClickListener(this.mFallbackListener);
        }
    }

    public void setIconText(String str, final String str2, boolean z, View.OnClickListener onClickListener) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "964853d4285720124c4d2413599e4324", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "964853d4285720124c4d2413599e4324");
        } else if (z) {
            setVisibility(8);
        } else {
            setVisibility(0);
            if (!TextUtils.isEmpty(str2)) {
                this.isIcon = true;
                if (str2.startsWith("http")) {
                    KNBRuntime.getRuntime().executeOnThreadPool(new Runnable() { // from class: com.dianping.titans.ui.ComplexButton.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bcdc5623dd52e6398e7385dc4da45798", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bcdc5623dd52e6398e7385dc4da45798");
                                return;
                            }
                            final Bitmap httpBitmap = ComplexButton.getHttpBitmap(ComplexButton.this.getContext(), str2);
                            if (httpBitmap != null) {
                                ComplexButton.this.mIv.post(new Runnable() { // from class: com.dianping.titans.ui.ComplexButton.1.1
                                    public static ChangeQuickRedirect changeQuickRedirect;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "ba3e7d6deda1b1598d63bc04852360dc", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "ba3e7d6deda1b1598d63bc04852360dc");
                                        } else {
                                            ComplexButton.this.mIv.setImageBitmap(httpBitmap);
                                        }
                                    }
                                });
                            }
                        }
                    });
                } else {
                    this.mIv.setImageURI(Uri.parse(str2));
                }
            } else if (!TextUtils.isEmpty(str)) {
                this.isIcon = false;
                this.mTv.setText(str);
            }
            this.mTv.setVisibility(this.isIcon ? 8 : 0);
            this.mIv.setVisibility(this.isIcon ? 0 : 8);
            if (onClickListener != null) {
                setOnClickListener(onClickListener);
            }
        }
    }

    public void setBitmap(Bitmap bitmap, View.OnClickListener onClickListener) {
        Object[] objArr = {bitmap, onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2de1acc8939ccb8ed37a53b7c74791e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2de1acc8939ccb8ed37a53b7c74791e");
            return;
        }
        setVisibility(0);
        this.isIcon = true;
        this.mTv.setVisibility(8);
        this.mIv.setVisibility(0);
        setOnClickListener(onClickListener);
        if (bitmap != null) {
            this.mIv.setImageBitmap(ViewUtils.createBitmap(getContext(), bitmap, false));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f589cac6f61fad8d07db7f6ed8e1675", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f589cac6f61fad8d07db7f6ed8e1675")).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            this.mIv.setColorFilter(-7829368, PorterDuff.Mode.MULTIPLY);
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.mIv.setColorFilter((ColorFilter) null);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51dd033e0eb1c20f8f95292cdfcd002e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51dd033e0eb1c20f8f95292cdfcd002e")).booleanValue();
        }
        if (super.performClick()) {
            if (this.performClickListener != null) {
                this.performClickListener.onPerformClick(this);
                return true;
            }
            return true;
        }
        return false;
    }

    public void setPerformClickListener(PerformClickListener performClickListener) {
        this.performClickListener = performClickListener;
    }

    public void setTextSize(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e12cd24ecdadd8179f8703e97387686", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e12cd24ecdadd8179f8703e97387686");
        } else {
            this.mTv.setTextSize(i);
        }
    }

    public void setTextColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70123b78d02fa2ca706e68bcd2e163fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70123b78d02fa2ca706e68bcd2e163fe");
        } else {
            this.mTv.setTextColor(i);
        }
    }

    public static Bitmap getHttpBitmap(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d284d2f29d9a7d46f246851cf95ab4c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d284d2f29d9a7d46f246851cf95ab4c6");
        }
        Bitmap downloadBitmap = ViewUtils.downloadBitmap(str, 60000);
        if (downloadBitmap != null) {
            return ViewUtils.createBitmap(context, downloadBitmap, false);
        }
        return null;
    }
}
