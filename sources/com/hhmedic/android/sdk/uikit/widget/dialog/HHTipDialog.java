package com.hhmedic.android.sdk.uikit.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.hhmedic.android.sdk.uikit.utils.HHDisplayHelper;
import com.hhmedic.android.sdk.uikit.widget.HHLoadingView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHTipDialog extends Dialog {
    public HHTipDialog(Context context) {
        this(context, 2131558704);
    }

    public HHTipDialog(Context context, int i) {
        super(context, i);
        setCanceledOnTouchOutside(false);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initDialogWidth();
    }

    private void initDialogWidth() {
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            window.setAttributes(attributes);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Builder {
        public static final int ICON_TYPE_FAIL = 3;
        public static final int ICON_TYPE_INFO = 4;
        public static final int ICON_TYPE_LOADING = 1;
        public static final int ICON_TYPE_NOTHING = 0;
        public static final int ICON_TYPE_SUCCESS = 2;
        private final Context mContext;
        private int mCurrentIconType = 0;
        private CharSequence mTipWord;

        /* compiled from: ProGuard */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes2.dex */
        public @interface IconType {
        }

        public Builder(Context context) {
            this.mContext = context;
        }

        public Builder setIconType(int i) {
            this.mCurrentIconType = i;
            return this;
        }

        public Builder setTipWord(CharSequence charSequence) {
            this.mTipWord = charSequence;
            return this;
        }

        public HHTipDialog create() {
            return create(true);
        }

        public HHTipDialog create(boolean z) {
            HHTipDialog hHTipDialog = new HHTipDialog(this.mContext);
            hHTipDialog.setCancelable(z);
            hHTipDialog.setContentView(R.layout.hh_tips_dialog_layout);
            ViewGroup viewGroup = (ViewGroup) hHTipDialog.findViewById(R.id.contentWrap);
            if (this.mCurrentIconType == 1) {
                HHLoadingView hHLoadingView = new HHLoadingView(this.mContext);
                hHLoadingView.setColor(-1);
                hHLoadingView.setSize(HHDisplayHelper.dp2px(this.mContext, 32));
                hHLoadingView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                viewGroup.addView(hHLoadingView);
            } else if (this.mCurrentIconType == 2 || this.mCurrentIconType == 3 || this.mCurrentIconType == 4) {
                ImageView imageView = new ImageView(this.mContext);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                viewGroup.addView(imageView);
            }
            if (this.mTipWord != null && this.mTipWord.length() > 0) {
                TextView textView = new TextView(this.mContext);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                if (this.mCurrentIconType != 0) {
                    layoutParams.topMargin = HHDisplayHelper.dp2px(this.mContext, 12);
                }
                textView.setLayoutParams(layoutParams);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(17);
                textView.setMaxLines(2);
                textView.setTextColor(ContextCompat.getColor(this.mContext, 17170443));
                textView.setTextSize(2, 14.0f);
                textView.setText(this.mTipWord);
                viewGroup.addView(textView);
            }
            return hHTipDialog;
        }
    }
}
