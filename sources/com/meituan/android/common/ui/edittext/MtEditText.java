package com.meituan.android.common.ui.edittext;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.constraint.R;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.LeadingMarginSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MtEditText extends LinearLayout {
    public static final int MTEDITTEXT_TYPE_BASIC = 0;
    public static final int MTEDITTEXT_TYPE_BASIC_CLEAR = 1;
    public static final int MTEDITTEXT_TYPE_BASIC_CLEAR_TITLE = 3;
    public static final int MTEDITTEXT_TYPE_BASIC_IMAGE_TITLE = 4;
    public static final int MTEDITTEXT_TYPE_BASIC_INSIDE_RIGHT_WARNNING = 5;
    public static final int MTEDITTEXT_TYPE_BASIC_LARGETEXT = 14;
    public static final int MTEDITTEXT_TYPE_BASIC_OUTSIDE_RIGHT_WARNNING = 6;
    public static final int MTEDITTEXT_TYPE_BASIC_TITLE = 2;
    public static final int MTEDITTEXT_TYPE_COMMENT = 11;
    public static final int MTEDITTEXT_TYPE_MULTICOMMENT = 12;
    public static final int MTEDITTEXT_TYPE_MULTILINE = 7;
    public static final int MTEDITTEXT_TYPE_MULTILINE_ALL_HINT = 10;
    public static final int MTEDITTEXT_TYPE_MULTILINE_HINT = 8;
    public static final int MTEDITTEXT_TYPE_MULTILINE_HINT_BORDER = 9;
    public static final int MTEDITTEXT_TYPE_PAY = 13;
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context context;
    private TextView insideLeftTextView;
    private TextView insideRightButton;
    private TextView insideRightTextView;
    private boolean isPayShow;
    private EditText mainContentEditText;
    private int mtedittext_type;
    private TextView outsideRightTextView;
    private RelativeLayout relativeContainer;
    private View rightContainer;
    private ImageView rightImageView;
    private RmbSpan rmbSpan;
    private TextWatcher textWatcher;
    private TextView titleTextView;
    private ViewStub viewStub;

    public MtEditText(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7dbda05de6c642500ecf2d086784bd7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7dbda05de6c642500ecf2d086784bd7");
            return;
        }
        this.mtedittext_type = 0;
        this.isPayShow = false;
        this.textWatcher = new TextWatcher() { // from class: com.meituan.android.common.ui.edittext.MtEditText.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                Object[] objArr2 = {charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "030a828c81cfc3f8778bebb27c9db2cc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "030a828c81cfc3f8778bebb27c9db2cc");
                } else if (MtEditText.this.mtedittext_type != 13 || MtEditText.this.isPayShow) {
                } else {
                    MtEditText.this.mainContentEditText.setPadding(0, MtEditText.this.getResources().getDimensionPixelSize(R.dimen.commonui_edittext_pay_padding_top), MtEditText.this.getResources().getDimensionPixelSize(R.dimen.commonui_edittext_pay_padding_right), MtEditText.this.getResources().getDimensionPixelSize(R.dimen.commonui_edittext_pay_padding_top));
                    MtEditText.this.setTextSize(0, MtEditText.this.context.getResources().getDimensionPixelSize(R.dimen.commonui_edittext_pay_text_size));
                }
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                Object[] objArr2 = {editable};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0c5afca0582496c9672083aa1af418f9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0c5afca0582496c9672083aa1af418f9");
                    return;
                }
                if (MtEditText.this.mtedittext_type == 4 || MtEditText.this.mtedittext_type == 3 || 1 == MtEditText.this.mtedittext_type) {
                    MtEditText.this.showRightImageView();
                }
                if (MtEditText.this.mtedittext_type == 13) {
                    if (!MtEditText.this.isPayShow) {
                        MtEditText.this.isPayShow = true;
                        MtEditText.this.setRMBIcon(editable);
                    } else {
                        MtEditText.this.setSelection(MtEditText.this.getLength());
                    }
                    if (MtEditText.this.getLength() == 0) {
                        MtEditText.this.isPayShow = false;
                        MtEditText.this.setTextSize(0, MtEditText.this.context.getResources().getDimensionPixelSize(R.dimen.commonui_edittext_pay_hint_text_size));
                        MtEditText.this.mainContentEditText.setPadding(0, MtEditText.this.getResources().getDimensionPixelSize(R.dimen.commonui_edittext_pay_hint_padding_top), MtEditText.this.getResources().getDimensionPixelSize(R.dimen.commonui_edittext_pay_padding_right), MtEditText.this.getResources().getDimensionPixelSize(R.dimen.commonui_edittext_pay_hint_padding_top));
                    }
                }
            }
        };
        this.context = context;
        initView(context, null);
    }

    public MtEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "597576e204641067f0e85a554ce8d1a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "597576e204641067f0e85a554ce8d1a0");
            return;
        }
        this.mtedittext_type = 0;
        this.isPayShow = false;
        this.textWatcher = new TextWatcher() { // from class: com.meituan.android.common.ui.edittext.MtEditText.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                Object[] objArr2 = {charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "030a828c81cfc3f8778bebb27c9db2cc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "030a828c81cfc3f8778bebb27c9db2cc");
                } else if (MtEditText.this.mtedittext_type != 13 || MtEditText.this.isPayShow) {
                } else {
                    MtEditText.this.mainContentEditText.setPadding(0, MtEditText.this.getResources().getDimensionPixelSize(R.dimen.commonui_edittext_pay_padding_top), MtEditText.this.getResources().getDimensionPixelSize(R.dimen.commonui_edittext_pay_padding_right), MtEditText.this.getResources().getDimensionPixelSize(R.dimen.commonui_edittext_pay_padding_top));
                    MtEditText.this.setTextSize(0, MtEditText.this.context.getResources().getDimensionPixelSize(R.dimen.commonui_edittext_pay_text_size));
                }
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                Object[] objArr2 = {editable};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0c5afca0582496c9672083aa1af418f9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0c5afca0582496c9672083aa1af418f9");
                    return;
                }
                if (MtEditText.this.mtedittext_type == 4 || MtEditText.this.mtedittext_type == 3 || 1 == MtEditText.this.mtedittext_type) {
                    MtEditText.this.showRightImageView();
                }
                if (MtEditText.this.mtedittext_type == 13) {
                    if (!MtEditText.this.isPayShow) {
                        MtEditText.this.isPayShow = true;
                        MtEditText.this.setRMBIcon(editable);
                    } else {
                        MtEditText.this.setSelection(MtEditText.this.getLength());
                    }
                    if (MtEditText.this.getLength() == 0) {
                        MtEditText.this.isPayShow = false;
                        MtEditText.this.setTextSize(0, MtEditText.this.context.getResources().getDimensionPixelSize(R.dimen.commonui_edittext_pay_hint_text_size));
                        MtEditText.this.mainContentEditText.setPadding(0, MtEditText.this.getResources().getDimensionPixelSize(R.dimen.commonui_edittext_pay_hint_padding_top), MtEditText.this.getResources().getDimensionPixelSize(R.dimen.commonui_edittext_pay_padding_right), MtEditText.this.getResources().getDimensionPixelSize(R.dimen.commonui_edittext_pay_hint_padding_top));
                    }
                }
            }
        };
        this.context = context;
        initView(context, attributeSet);
    }

    public MtEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f480cd40a10b027e15c5632c7b8aa1e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f480cd40a10b027e15c5632c7b8aa1e3");
            return;
        }
        this.mtedittext_type = 0;
        this.isPayShow = false;
        this.textWatcher = new TextWatcher() { // from class: com.meituan.android.common.ui.edittext.MtEditText.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i22, int i3) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i22, int i3) {
                Object[] objArr2 = {charSequence, Integer.valueOf(i2), Integer.valueOf(i22), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "030a828c81cfc3f8778bebb27c9db2cc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "030a828c81cfc3f8778bebb27c9db2cc");
                } else if (MtEditText.this.mtedittext_type != 13 || MtEditText.this.isPayShow) {
                } else {
                    MtEditText.this.mainContentEditText.setPadding(0, MtEditText.this.getResources().getDimensionPixelSize(R.dimen.commonui_edittext_pay_padding_top), MtEditText.this.getResources().getDimensionPixelSize(R.dimen.commonui_edittext_pay_padding_right), MtEditText.this.getResources().getDimensionPixelSize(R.dimen.commonui_edittext_pay_padding_top));
                    MtEditText.this.setTextSize(0, MtEditText.this.context.getResources().getDimensionPixelSize(R.dimen.commonui_edittext_pay_text_size));
                }
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                Object[] objArr2 = {editable};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0c5afca0582496c9672083aa1af418f9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0c5afca0582496c9672083aa1af418f9");
                    return;
                }
                if (MtEditText.this.mtedittext_type == 4 || MtEditText.this.mtedittext_type == 3 || 1 == MtEditText.this.mtedittext_type) {
                    MtEditText.this.showRightImageView();
                }
                if (MtEditText.this.mtedittext_type == 13) {
                    if (!MtEditText.this.isPayShow) {
                        MtEditText.this.isPayShow = true;
                        MtEditText.this.setRMBIcon(editable);
                    } else {
                        MtEditText.this.setSelection(MtEditText.this.getLength());
                    }
                    if (MtEditText.this.getLength() == 0) {
                        MtEditText.this.isPayShow = false;
                        MtEditText.this.setTextSize(0, MtEditText.this.context.getResources().getDimensionPixelSize(R.dimen.commonui_edittext_pay_hint_text_size));
                        MtEditText.this.mainContentEditText.setPadding(0, MtEditText.this.getResources().getDimensionPixelSize(R.dimen.commonui_edittext_pay_hint_padding_top), MtEditText.this.getResources().getDimensionPixelSize(R.dimen.commonui_edittext_pay_padding_right), MtEditText.this.getResources().getDimensionPixelSize(R.dimen.commonui_edittext_pay_hint_padding_top));
                    }
                }
            }
        };
        this.context = context;
        initView(context, attributeSet);
    }

    private void initAttr(AttributeSet attributeSet) {
        Object[] objArr = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b9bafee469d779dcf63ffffcc7298f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b9bafee469d779dcf63ffffcc7298f1");
            return;
        }
        addEditextView(attributeSet);
        TypedArray obtainStyledAttributes = this.context.obtainStyledAttributes(attributeSet, new int[]{R.attr.edittexttype});
        this.mtedittext_type = obtainStyledAttributes.getInt(0, 0);
        setMtEditTextType(this.mtedittext_type);
        obtainStyledAttributes.recycle();
    }

    private void addEditextView(AttributeSet attributeSet) {
        Object[] objArr = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81f507fd93ba889f9265ff34f23cc338", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81f507fd93ba889f9265ff34f23cc338");
            return;
        }
        this.mainContentEditText = new EditText(this.context, attributeSet);
        this.mainContentEditText.setSingleLine();
        this.mainContentEditText.setId(R.id.mtedittext_main_content);
        setTextSize(0, this.context.getResources().getDimensionPixelSize(R.dimen.commonui_edittext_textsize));
        setTextColor(R.color.commonui_editext_text_color);
        this.mainContentEditText.setBackgroundColor(0);
        this.mainContentEditText.setPadding(getResources().getDimensionPixelSize(R.dimen.commonui_edittext_padding_left), getResources().getDimensionPixelSize(R.dimen.commonui_edittext_padding_right), getResources().getDimensionPixelSize(R.dimen.commonui_edittext_padding_right), getResources().getDimensionPixelSize(R.dimen.commonui_edittext_padding_right));
        int indexOfChild = this.relativeContainer.indexOfChild(this.viewStub);
        this.relativeContainer.removeViewInLayout(this.viewStub);
        this.relativeContainer.addView(this.mainContentEditText, indexOfChild, this.viewStub.getLayoutParams());
        this.mainContentEditText.addTextChangedListener(this.textWatcher);
    }

    private void initView(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df8c7b86015b67acb82009f06dd45416", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df8c7b86015b67acb82009f06dd45416");
            return;
        }
        setOrientation(1);
        View inflate = LayoutInflater.from(context).inflate(R.layout.commonui_editext, (ViewGroup) this, true);
        this.rightContainer = inflate.findViewById(R.id.mtedittext_right_container);
        this.relativeContainer = (RelativeLayout) inflate.findViewById(R.id.mteditext_relative_container);
        this.viewStub = (ViewStub) inflate.findViewById(R.id.mtedittext_main_content);
        this.rightImageView = (ImageView) inflate.findViewById(R.id.mtedittext_right_view);
        this.titleTextView = (TextView) inflate.findViewById(R.id.mtedittext_title);
        this.insideRightTextView = (TextView) inflate.findViewById(R.id.mtedittext_inside_right_textview);
        this.outsideRightTextView = (TextView) inflate.findViewById(R.id.mtedittext_outside_right_textview);
        this.insideLeftTextView = (TextView) inflate.findViewById(R.id.mtedittext_inside_left_textview);
        this.insideRightButton = (TextView) inflate.findViewById(R.id.mtedittext_inside_right_button);
        if (attributeSet != null) {
            initAttr(attributeSet);
        }
    }

    public void setMtEditTextType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d069ffb8acb410d62f6c7a2fa55349d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d069ffb8acb410d62f6c7a2fa55349d");
            return;
        }
        this.mtedittext_type = i;
        switch (i) {
            case 0:
                return;
            case 1:
                setClearUsage();
                return;
            case 2:
                setTitleUsage();
                return;
            case 3:
                setTitleClearUsage();
                return;
            case 4:
                setTitleImageUsage();
                return;
            case 5:
                setInsideRightTextView();
                return;
            case 6:
                setOutSideRightTextView();
                return;
            case 7:
                setMultiLineEditText();
                return;
            case 8:
                setMultiLineWithHintEditText();
                return;
            case 9:
                setBordereEditText();
                return;
            case 10:
                setAllHintEditText();
                return;
            case 11:
                setCommentEditText();
                return;
            case 12:
                setMultiLineCommentEditText();
                return;
            case 13:
                setPayEditText();
                return;
            case 14:
                setBasicLargeEditText();
                return;
            default:
                return;
        }
    }

    public void setRelativeContainer(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5949601f98e734efd260c509f2d2836", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5949601f98e734efd260c509f2d2836");
        } else {
            this.relativeContainer.setBackgroundResource(i);
        }
    }

    public void setHint(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b136ab44ac668a44d947a9844942d1b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b136ab44ac668a44d947a9844942d1b7");
        } else {
            this.mainContentEditText.setHint(str);
        }
    }

    @Override // android.widget.LinearLayout
    public void setGravity(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "275e024b7fbddfcf97e078d966c51415", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "275e024b7fbddfcf97e078d966c51415");
        } else {
            this.mainContentEditText.setGravity(i);
        }
    }

    public void setTextSize(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "970eedd2470ad56d65d1bfac3e0ec3d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "970eedd2470ad56d65d1bfac3e0ec3d4");
        } else {
            this.mainContentEditText.setTextSize(f);
        }
    }

    public void setTextSize(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2fe6b13c81be72d47aeb5ba0d53effa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2fe6b13c81be72d47aeb5ba0d53effa");
        } else {
            this.mainContentEditText.setTextSize(i, i2);
        }
    }

    public int getLength() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6cfc1bdc9482f410b368f1a5d794bb91", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6cfc1bdc9482f410b368f1a5d794bb91")).intValue() : this.mainContentEditText.length();
    }

    public void setSelection(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fdccffc1788aee5c11cc70f16b69861a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fdccffc1788aee5c11cc70f16b69861a");
        } else {
            this.mainContentEditText.setSelection(i);
        }
    }

    public void setInputType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8177a6bf5abe3be2ede1764ca7d3d9f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8177a6bf5abe3be2ede1764ca7d3d9f5");
        } else {
            this.mainContentEditText.setInputType(i);
        }
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        Object[] objArr = {inputFilterArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f534a8c55310a091dfe703c73386fd0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f534a8c55310a091dfe703c73386fd0d");
        } else {
            this.mainContentEditText.setFilters(inputFilterArr);
        }
    }

    public void setTextColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45e6ce88298ab0647cafd4f005e5c70f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45e6ce88298ab0647cafd4f005e5c70f");
        } else {
            this.mainContentEditText.setTextColor(getColor(this.context, i));
        }
    }

    public void setTextWatcher(TextWatcher textWatcher) {
        Object[] objArr = {textWatcher};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ff838604842cd4acf25806a627309bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ff838604842cd4acf25806a627309bb");
        } else {
            this.mainContentEditText.addTextChangedListener(textWatcher);
        }
    }

    public void setRMBIcon(Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4907fde103a90cd7fc4fdd4f70cd0a91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4907fde103a90cd7fc4fdd4f70cd0a91");
            return;
        }
        if (this.rmbSpan == null) {
            this.rmbSpan = new RmbSpan();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable);
        spannableStringBuilder.setSpan(this.rmbSpan, 0, 0, 18);
        this.mainContentEditText.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
    }

    public String getText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9c46e0a91f89048f8de6b363b813b19", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9c46e0a91f89048f8de6b363b813b19");
        }
        Editable text = this.mainContentEditText.getText();
        return text != null ? text.toString() : "";
    }

    public void setMaxLines(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5933da46bc9a6c0867ca447e41074dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5933da46bc9a6c0867ca447e41074dd");
        } else {
            this.mainContentEditText.setMaxLines(i);
        }
    }

    public void setLines(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22a64f80a4c86cd14d69cbee4bdc17b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22a64f80a4c86cd14d69cbee4bdc17b7");
            return;
        }
        enableMultiLine();
        this.mainContentEditText.setLines(i);
    }

    public void enableMultiLine() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8835302d235f293f8d67915190cacd99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8835302d235f293f8d67915190cacd99");
            return;
        }
        this.mainContentEditText.setInputType(131072);
        this.mainContentEditText.setGravity(48);
        this.mainContentEditText.setSingleLine(false);
        this.mainContentEditText.setHorizontallyScrolling(false);
    }

    public void setMinLines(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "052102ffb34fa581f4657cfbd19a3c52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "052102ffb34fa581f4657cfbd19a3c52");
        } else {
            this.mainContentEditText.setMinLines(i);
        }
    }

    public void setEditTextBackgroundResource(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91b54c58524c627f5ab50bc67aa7641d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91b54c58524c627f5ab50bc67aa7641d");
        } else {
            this.mainContentEditText.setBackgroundResource(i);
        }
    }

    public void setRightImageView(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d895310f498aba5803270eaa6e2222d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d895310f498aba5803270eaa6e2222d6");
            return;
        }
        showRightImageView();
        this.rightImageView.setImageDrawable(drawable);
    }

    public void showRightImageView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d2ee9fc857deedb705db69853571c83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d2ee9fc857deedb705db69853571c83");
            return;
        }
        this.rightContainer.setVisibility(0);
        this.rightImageView.setVisibility(0);
    }

    public void setRightImageView(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03664985e68a460da76212788396e6b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03664985e68a460da76212788396e6b1");
            return;
        }
        this.rightImageView.setImageResource(i);
        if (R.drawable.commonui_editext_clear == i) {
            this.rightImageView.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.common.ui.edittext.MtEditText.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0811df95946fed7378edf6e1955cb935", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0811df95946fed7378edf6e1955cb935");
                        return;
                    }
                    MtEditText.this.mainContentEditText.setText("");
                    MtEditText.this.rightImageView.setVisibility(8);
                }
            });
        }
    }

    public void setTitle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c00e142ea6e8f319e71a90e21319def3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c00e142ea6e8f319e71a90e21319def3");
            return;
        }
        this.titleTextView.setVisibility(0);
        this.titleTextView.setText(str);
    }

    public void setTitleColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "007fc0a17d93ce5b9675874dcc1a3390", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "007fc0a17d93ce5b9675874dcc1a3390");
        } else {
            this.titleTextView.setTextColor(getColor(this.context, i));
        }
    }

    public void setInsideRightButtonText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c6c1563981f64353fded4ad8322c6e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c6c1563981f64353fded4ad8322c6e7");
            return;
        }
        this.insideRightButton.setVisibility(0);
        this.insideRightButton.setText(str);
        this.insideRightButton.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.common.ui.edittext.MtEditText.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d9129fa67016fb4eedb5b25e39b876f5", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d9129fa67016fb4eedb5b25e39b876f5");
                } else if (MtEditText.this.context.getString(R.string.commonui_editext_anonymous).equals(MtEditText.this.insideRightButton.getText())) {
                    MtEditText.this.insideRightButton.setText(MtEditText.this.context.getString(R.string.commonui_editext_anonymoused));
                } else if (MtEditText.this.context.getString(R.string.commonui_editext_anonymoused).equals(MtEditText.this.insideRightButton.getText())) {
                    MtEditText.this.insideRightButton.setText(MtEditText.this.context.getString(R.string.commonui_editext_anonymous));
                }
            }
        });
    }

    public void setInsideRightButtonTextColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c29e598ac8121c971cf3e77e1d20ad6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c29e598ac8121c971cf3e77e1d20ad6");
        } else {
            this.insideRightButton.setTextColor(getColor(this.context, i));
        }
    }

    public void setInsideRightButtonOnclick(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea87a556028421f6dc82cd77e6a004f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea87a556028421f6dc82cd77e6a004f6");
        } else {
            this.insideRightButton.setOnClickListener(onClickListener);
        }
    }

    public void setInsideRightBackground(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32771dd2fd31c73ef991456d5bd3c2af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32771dd2fd31c73ef991456d5bd3c2af");
            return;
        }
        this.insideRightButton.setVisibility(0);
        this.insideRightButton.setBackgroundResource(i);
    }

    public void setInsideRightTextSize(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d5df34b0cfe0f386af823f5389dbae0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d5df34b0cfe0f386af823f5389dbae0");
            return;
        }
        showInsideRightView();
        this.insideRightTextView.setTextSize(i);
    }

    public void showInsideRightView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5031bb0c37352ad13f5140f681fda13d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5031bb0c37352ad13f5140f681fda13d");
            return;
        }
        this.rightContainer.setVisibility(0);
        this.insideRightTextView.setVisibility(0);
    }

    public void setInsideRightText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc0690227bf990c04574a1905aff972e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc0690227bf990c04574a1905aff972e");
            return;
        }
        showInsideRightView();
        this.insideRightTextView.setText(str);
    }

    public void setInsideRightTextColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb143d3a1430e761f4420bff71c6cf98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb143d3a1430e761f4420bff71c6cf98");
        } else {
            this.insideRightTextView.setTextColor(getColor(this.context, i));
        }
    }

    public void setInsideRightTextBackGround(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3089995b6b70e1211e35be860f532381", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3089995b6b70e1211e35be860f532381");
        } else {
            this.insideRightTextView.setBackgroundResource(i);
        }
    }

    public void setOutsideRightText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b8f4d310dda6144e50da308ab479ee3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b8f4d310dda6144e50da308ab479ee3");
            return;
        }
        showOutsideRightView();
        this.outsideRightTextView.setText(str);
    }

    public void showOutsideRightView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "293a7e30bc878cca00cc75459f1cbc41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "293a7e30bc878cca00cc75459f1cbc41");
        } else {
            this.outsideRightTextView.setVisibility(0);
        }
    }

    public void setOutsideRightTextColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ec589728b14e34398b18eeba8d4510c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ec589728b14e34398b18eeba8d4510c");
        } else {
            this.outsideRightTextView.setTextColor(getColor(this.context, i));
        }
    }

    public void setRightImageViewOnclickListener(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c10089a3dd78772b988c94621aec88d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c10089a3dd78772b988c94621aec88d");
        } else {
            this.rightImageView.setOnClickListener(onClickListener);
        }
    }

    public void setInsideLeftText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72ba4c6654b9fe544e50cc91ab2c1f9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72ba4c6654b9fe544e50cc91ab2c1f9c");
            return;
        }
        this.insideLeftTextView.setVisibility(0);
        this.insideLeftTextView.setText(str);
    }

    private void setClearUsage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8d41abc86fe196562854e788b63a897", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8d41abc86fe196562854e788b63a897");
        } else {
            setRightImageView(R.drawable.commonui_editext_clear);
        }
    }

    private void setTitleUsage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abe9734e5a97318e5895830fd08a81e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abe9734e5a97318e5895830fd08a81e8");
        } else {
            setTitle(this.context.getString(R.string.commonui_editext_title));
        }
    }

    private void setTitleClearUsage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6fed44756b0ceea1bfcd8a414ffd2f0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6fed44756b0ceea1bfcd8a414ffd2f0a");
            return;
        }
        setClearUsage();
        setTitleUsage();
    }

    private void setTitleImageUsage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2b980db33587ffd0f140ac0049146aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2b980db33587ffd0f140ac0049146aa");
            return;
        }
        setRightImageView(R.drawable.commonui_action_bar_ic_arrow_right);
        setTitleUsage();
    }

    private void setBasicLargeEditText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6be28e862928975244914c6fa69b84a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6be28e862928975244914c6fa69b84a");
            return;
        }
        setHint(this.context.getString(R.string.commonui_editext_hint));
        setLines(10);
    }

    private void setPayEditText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d1f85656ab1bcbb001e047be642b6d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d1f85656ab1bcbb001e047be642b6d6");
            return;
        }
        setTitle(this.context.getString(R.string.commonui_editext_pay_title));
        setTitleColor(R.color.commonui_editext_pay_text_color);
        setGravity(5);
        setInputType(12290);
        this.mainContentEditText.setPadding(0, getResources().getDimensionPixelSize(R.dimen.commonui_edittext_pay_hint_padding_top), getResources().getDimensionPixelSize(R.dimen.commonui_edittext_pay_padding_right), getResources().getDimensionPixelSize(R.dimen.commonui_edittext_pay_hint_padding_top));
        setTextColor(R.color.commonui_editext_warning_color);
        setHint(this.context.getString(R.string.commonui_editext_pay_hint));
        setFilters(new InputFilter[]{new CashierInputFilter()});
        setSelection(getLength());
    }

    private void setMultiLineCommentEditText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5cb9fa19998014a37bde57ebb6a20ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5cb9fa19998014a37bde57ebb6a20ce");
            return;
        }
        enableMultiLine();
        setHint(this.context.getString(R.string.commonui_editext_comment));
        setRelativeContainer(R.drawable.commonui_edittext_container_style);
        setEditTextBackgroundResource(R.drawable.commonui_edittext_comment_style);
    }

    private void setCommentEditText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b2123d3d8981accc944a1f2d43826c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b2123d3d8981accc944a1f2d43826c4");
            return;
        }
        setHint(this.context.getString(R.string.commonui_editext_comment));
        setRelativeContainer(R.drawable.commonui_edittext_container_style);
        setEditTextBackgroundResource(R.drawable.commonui_edittext_comment_style);
    }

    private void setAllHintEditText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2295e146f17b489194beae5ed8da35a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2295e146f17b489194beae5ed8da35a8");
            return;
        }
        setLines(4);
        setHint(this.context.getString(R.string.commonui_editext_hint));
        setInsideLeftText(this.context.getString(R.string.commonui_editext_left_behind_hint));
        setInsideRightButtonText(this.context.getString(R.string.commonui_editext_anonymous));
        setInsideRightButtonTextColor(R.color.commonui_editext_text_color);
        setInsideRightBackground(R.drawable.commonui_edittext_right_inside_button_selector);
    }

    private void setMultiLineEditText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "158c3c4aa9d5edb9f822463cb2621184", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "158c3c4aa9d5edb9f822463cb2621184");
        } else {
            setLines(4);
        }
    }

    private void setBordereEditText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "391fbd92b4aa771df0c0122c0bfb258d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "391fbd92b4aa771df0c0122c0bfb258d");
            return;
        }
        setMultiLineWithHintEditText();
        setBackgroundResource(R.drawable.commonui_edittext_cornor);
    }

    private void setMultiLineWithHintEditText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d7e64fb7ff41620352711a87243fb40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d7e64fb7ff41620352711a87243fb40");
            return;
        }
        setLines(4);
        setHint(this.context.getString(R.string.commonui_editext_hint));
        setInsideRightButtonText(this.context.getString(R.string.commonui_editext_right_below_hint));
        setInsideRightTextColor(R.color.commonui_editext_hint_text_color);
    }

    private void setInsideRightTextView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f130ad6ecbf081e15bd7cac7984121a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f130ad6ecbf081e15bd7cac7984121a8");
            return;
        }
        setTitle(this.context.getString(R.string.commonui_editext_title));
        setInsideRightText(this.context.getString(R.string.commonui_editext_warning));
    }

    private void setOutSideRightTextView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "928bbc5a43e252bfd5d276967c858e10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "928bbc5a43e252bfd5d276967c858e10");
        } else {
            setOutsideRightText(this.context.getString(R.string.commonui_editext_outside_warning));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class RmbSpan implements LeadingMarginSpan {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Drawable d;

        public RmbSpan() {
            Object[] objArr = {MtEditText.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c6baa5ebc233d1f22d63e099be497d0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c6baa5ebc233d1f22d63e099be497d0");
                return;
            }
            this.d = MtEditText.this.context.getResources().getDrawable(R.drawable.commonui_rmb_icon);
            this.d.setBounds(0, 0, this.d.getIntrinsicWidth(), this.d.getIntrinsicHeight());
        }

        @Override // android.text.style.LeadingMarginSpan
        public int getLeadingMargin(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af64d842d1c7d94f90e84c58b674b909", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af64d842d1c7d94f90e84c58b674b909")).intValue() : this.d.getIntrinsicWidth();
        }

        @Override // android.text.style.LeadingMarginSpan
        public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
            Object[] objArr = {canvas, paint, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), charSequence, Integer.valueOf(i6), Integer.valueOf(i7), Byte.valueOf(z ? (byte) 1 : (byte) 0), layout};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "076d0daf04554ad82a904148aafbaaa8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "076d0daf04554ad82a904148aafbaaa8");
                return;
            }
            canvas.save();
            canvas.translate((int) layout.getLineLeft(0), (i5 - this.d.getBounds().bottom) - paint.getFontMetricsInt().descent);
            this.d.draw(canvas);
            canvas.restore();
        }
    }

    public static final int getColor(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9639dde619320f7a5e25e9d599c74bce", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9639dde619320f7a5e25e9d599c74bce")).intValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColor(i);
        }
        return context.getResources().getColor(i);
    }
}
