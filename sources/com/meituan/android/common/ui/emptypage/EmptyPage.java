package com.meituan.android.common.ui.emptypage;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class EmptyPage extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Button button;
    public String buttonText;
    public ImageView image;
    public int imageId;
    public String mainMessage;
    public TextView mainMessageTV;
    public String subMessage;
    public TextView subMessageTV;

    public static int getClickableViewId() {
        return R.id.button;
    }

    public EmptyPage(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1422b289d644e16f4e1d42ed11d3787a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1422b289d644e16f4e1d42ed11d3787a");
        }
    }

    public EmptyPage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d4fd44f8ef90756242b6bcd4f5d7a1e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d4fd44f8ef90756242b6bcd4f5d7a1e");
        }
    }

    public EmptyPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a13bbfc40e0a59eae8857a8ecdaae7e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a13bbfc40e0a59eae8857a8ecdaae7e2");
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.commonui_empty_page, this);
        initAttr(context, attributeSet);
        initView();
        initData();
    }

    private void initAttr(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73b49553822ffdf4da68eb9059fee553", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73b49553822ffdf4da68eb9059fee553");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.pageImage, R.attr.mainMessage, R.attr.subMessage, R.attr.buttonText});
        this.buttonText = obtainStyledAttributes.getString(3);
        this.mainMessage = obtainStyledAttributes.getString(1);
        this.subMessage = obtainStyledAttributes.getString(2);
        this.imageId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
    }

    private void initView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2bd93fe9e382c8afaf8c51e572ae52b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2bd93fe9e382c8afaf8c51e572ae52b");
            return;
        }
        this.mainMessageTV = (TextView) findViewById(R.id.main_message);
        this.subMessageTV = (TextView) findViewById(R.id.sub_message);
        this.button = (Button) findViewById(R.id.button);
        this.image = (ImageView) findViewById(R.id.image);
    }

    private void initData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac642b8932f5e186e54e11042b24c6be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac642b8932f5e186e54e11042b24c6be");
            return;
        }
        setMainMessage(this.mainMessage);
        setSubMessage(this.subMessage);
        setImage(this.imageId);
        setButtonText(this.buttonText);
    }

    public void setSubMessage(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9bdc414f1004511fb9b29891fe9ff25c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9bdc414f1004511fb9b29891fe9ff25c");
            return;
        }
        this.subMessage = str;
        if (TextUtils.isEmpty(this.subMessage)) {
            this.subMessageTV.setVisibility(8);
            return;
        }
        this.subMessageTV.setVisibility(0);
        this.subMessageTV.setText(str);
    }

    public void setButtonText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96a9f6bda3108eb2c9ce021db50914f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96a9f6bda3108eb2c9ce021db50914f1");
            return;
        }
        this.buttonText = str;
        if (TextUtils.isEmpty(this.buttonText)) {
            this.button.setVisibility(8);
            return;
        }
        this.button.setVisibility(0);
        this.button.setText(str);
    }

    public void setMainMessage(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c41b8e47e67cceaa4208175fcb3e664f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c41b8e47e67cceaa4208175fcb3e664f");
            return;
        }
        this.mainMessage = str;
        if (TextUtils.isEmpty(this.mainMessage)) {
            this.mainMessageTV.setVisibility(8);
            return;
        }
        this.mainMessageTV.setVisibility(0);
        this.mainMessageTV.setText(str);
    }

    public View getClickableView() {
        return this.button;
    }

    public void setImage(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "757548bbd1d5471649a29af727875a1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "757548bbd1d5471649a29af727875a1e");
            return;
        }
        this.imageId = i;
        if (this.imageId != 0) {
            this.image.setImageResource(this.imageId);
            this.image.setVisibility(0);
            return;
        }
        this.image.setVisibility(8);
    }

    public void setOnButtonClickListener(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb311109436d05ea640f11094ee627dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb311109436d05ea640f11094ee627dd");
        } else {
            this.button.setOnClickListener(onClickListener);
        }
    }
}
