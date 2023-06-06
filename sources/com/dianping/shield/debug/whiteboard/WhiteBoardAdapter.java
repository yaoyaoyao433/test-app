package com.dianping.shield.debug.whiteboard;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.GravityCompat;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.dianping.shield.debug.WhiteBoardDataStoreSnapshot;
import com.dianping.shield.debug.whiteboard.TitleLayout;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class WhiteBoardAdapter extends RecyclerView.a<ViewHolder> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final String[] types = {"Short", "Int", "Long", "Double", "Float", "Byte", "Char", "String", "Boolean", "BooleanArray", "ShortArray", "IntArray", "LongArray", "DoubleArray", "FloatArray", "ByteArray", "CharArray", "StringArray", "CharSequence", "CharSequenceArray", "CharSequenceArrayList", "IntegerArrayList", "StringArrayList", "Parcelable", "ParcelableArray", "ParcelableArrayList", "SparseParcelableArray", "Serializable", "Bundle"};
    private AlertDialog alertDialog;
    private Comparator<DataEntry> ascComparatorOnKey;
    private Comparator<DataEntry> ascComparatorOnType;
    private Context context;
    private Comparator<DataEntry> descComparatorOnKey;
    private Comparator<DataEntry> descComparatorOnType;
    private EditText dialogItemValue;
    private Spinner dialogSp;
    private List<DataEntry> mWhiteBoardList;
    private HashMap<String, Integer> operationTempo;
    private TextView warnValue;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum SortStyle {
        ASC,
        DESC;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        SortStyle() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8971d37d5a3b5205941768f0a6d3d29", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8971d37d5a3b5205941768f0a6d3d29");
            }
        }

        public static SortStyle valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0f7b92538d8b846a50686237976f27a3", RobustBitConfig.DEFAULT_VALUE) ? (SortStyle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0f7b92538d8b846a50686237976f27a3") : (SortStyle) Enum.valueOf(SortStyle.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static SortStyle[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "670be2499e09c292949e0ac60a58559c", RobustBitConfig.DEFAULT_VALUE) ? (SortStyle[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "670be2499e09c292949e0ac60a58559c") : (SortStyle[]) values().clone();
        }
    }

    public WhiteBoardAdapter(List<DataEntry> list, Context context) {
        Object[] objArr = {list, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a297b714ad562603ac1507754dcd495f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a297b714ad562603ac1507754dcd495f");
            return;
        }
        this.ascComparatorOnKey = getComparator(SortStyle.ASC, TitleLayout.SortRule.KEY);
        this.descComparatorOnKey = getComparator(SortStyle.DESC, TitleLayout.SortRule.KEY);
        this.ascComparatorOnType = getComparator(SortStyle.ASC, TitleLayout.SortRule.TYPE);
        this.descComparatorOnType = getComparator(SortStyle.DESC, TitleLayout.SortRule.TYPE);
        this.mWhiteBoardList = list;
        this.context = context;
        LinearLayout linearLayout = new LinearLayout(this.context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout2 = new LinearLayout(this.context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(60, 20, 60, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(5.0f);
        gradientDrawable.setStroke(2, Color.parseColor("#cccccc"));
        linearLayout2.setBackgroundDrawable(gradientDrawable);
        linearLayout.addView(linearLayout2, layoutParams);
        String[] strArr = (String[]) Arrays.copyOfRange(types, 0, 23);
        this.dialogSp = new Spinner(this.context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 80);
        SpinnerAdapter spinnerAdapter = new SpinnerAdapter(context, 17367043, 16908308, strArr);
        spinnerAdapter.notifyDataSetChanged();
        this.dialogSp.setAdapter((android.widget.SpinnerAdapter) spinnerAdapter);
        linearLayout2.addView(this.dialogSp, layoutParams2);
        this.dialogItemValue = new EditText(this.context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(60, 0, 60, 0);
        this.dialogItemValue.setInputType(131072);
        this.dialogItemValue.setSingleLine(false);
        this.dialogItemValue.setHorizontallyScrolling(false);
        this.dialogItemValue.setFocusable(true);
        this.dialogItemValue.setFocusableInTouchMode(true);
        linearLayout.addView(this.dialogItemValue, layoutParams3);
        this.warnValue = new TextView(this.context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(60, 0, 60, 0);
        this.warnValue.setTextSize(14.0f);
        this.warnValue.setTextColor(Color.parseColor("#FF0000"));
        linearLayout.addView(this.warnValue, layoutParams4);
        this.alertDialog = new AlertDialog.Builder(context).setTitle("Edit Value").setView(linearLayout).setPositiveButton("确定", (DialogInterface.OnClickListener) null).setNegativeButton(IPaymentManager.NO_ACTION, new DialogInterface.OnClickListener() { // from class: com.dianping.shield.debug.whiteboard.WhiteBoardAdapter.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4110905ffbf9850d0cc00659b2a7f0c4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4110905ffbf9850d0cc00659b2a7f0c4");
                }
            }
        }).create();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5721267705660356e5c984d344d7fe56", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5721267705660356e5c984d344d7fe56");
        }
        SwipeView swipeView = new SwipeView(viewGroup.getContext());
        swipeView.setOrientation(0);
        swipeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.leftMargin = 20;
        layoutParams.rightMargin = 20;
        swipeView.addView(linearLayout, layoutParams);
        TextView textView = new TextView(viewGroup.getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 16;
        layoutParams2.topMargin = 20;
        layoutParams2.bottomMargin = 20;
        textView.setTextSize(16.0f);
        textView.setTextColor(Color.parseColor(DiagnoseLog.COLOR_ERROR));
        linearLayout.addView(textView, layoutParams2);
        LinearLayout linearLayout2 = new LinearLayout(viewGroup.getContext());
        linearLayout2.setOrientation(0);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout2.setGravity(GravityCompat.END);
        linearLayout.addView(linearLayout2, layoutParams3);
        TextView textView2 = new TextView(viewGroup.getContext());
        ViewGroup.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        textView2.setPadding(10, 0, 10, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(0, Color.parseColor("#cccccc"));
        textView2.setBackgroundDrawable(gradientDrawable);
        linearLayout2.addView(textView2, layoutParams4);
        TextView textView3 = new TextView(viewGroup.getContext());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.gravity = 16;
        layoutParams5.topMargin = 20;
        layoutParams5.bottomMargin = 20;
        textView3.setMaxLines(999);
        linearLayout.addView(textView3, layoutParams5);
        LinearLayout linearLayout3 = new LinearLayout(viewGroup.getContext());
        linearLayout3.setOrientation(0);
        swipeView.addView(linearLayout3, new LinearLayout.LayoutParams((int) TbsListener.ErrorCode.NEEDDOWNLOAD_TRUE, -1));
        TextView textView4 = new TextView(viewGroup.getContext());
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -1);
        textView4.setBackgroundColor(Color.parseColor("#EE2C2C"));
        textView4.setText("Remove");
        textView4.setGravity(17);
        linearLayout3.addView(textView4, layoutParams6);
        ViewHolder viewHolder = new ViewHolder(swipeView, textView, textView3, textView2, textView4, linearLayout, linearLayout3, linearLayout2);
        viewHolder.deleteListener = new DeleteListener(this.context, viewHolder);
        viewHolder.deleteTextView.setOnClickListener(viewHolder.deleteListener);
        viewHolder.editListener = new EditListener(viewHolder);
        viewHolder.showInfoView.setOnClickListener(viewHolder.editListener);
        return viewHolder;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Object[] objArr = {viewHolder, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6818aa1e56b7a23e3992d27383d1ee89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6818aa1e56b7a23e3992d27383d1ee89");
            return;
        }
        DataEntry dataEntry = this.mWhiteBoardList.get(i);
        viewHolder.keyTextView.setText(dataEntry.getKey());
        viewHolder.valueTextView.setText(Html.fromHtml(dataEntry.getValue()));
        viewHolder.typeTextView.setText(types[dataEntry.getType()]);
        ((GradientDrawable) viewHolder.typeTextView.getBackground()).setColor(getTagColor(dataEntry.getType()));
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ca05c5a4f867bd79c802e368a5167ba", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ca05c5a4f867bd79c802e368a5167ba")).intValue() : this.mWhiteBoardList.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeData(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "517785f3dec66e49a41c2d763c55f655", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "517785f3dec66e49a41c2d763c55f655");
            return;
        }
        this.mWhiteBoardList.remove(i);
        notifyItemRemoved(i);
    }

    public void addData(String str, String str2, int i, int i2) {
        Object[] objArr = {str, str2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cd6af63b8c0ccbfa77cece24fd0cffc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cd6af63b8c0ccbfa77cece24fd0cffc");
            return;
        }
        int i3 = i2 + 1;
        this.mWhiteBoardList.add(i3, new DataEntry(str, str2, i));
        notifyItemInserted(i3);
    }

    public void sortEntry(SortStyle sortStyle, TitleLayout.SortRule sortRule) {
        Object[] objArr = {sortStyle, sortRule};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "625f29942ef6fa279405ad24e1657a1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "625f29942ef6fa279405ad24e1657a1c");
            return;
        }
        Comparator<DataEntry> comparator = null;
        if (sortRule == TitleLayout.SortRule.KEY && sortStyle == SortStyle.ASC) {
            comparator = this.ascComparatorOnKey;
        } else if (sortRule == TitleLayout.SortRule.KEY && sortStyle == SortStyle.DESC) {
            comparator = this.descComparatorOnKey;
        } else if (sortRule == TitleLayout.SortRule.TYPE && sortStyle == SortStyle.ASC) {
            comparator = this.ascComparatorOnType;
        } else if (sortRule == TitleLayout.SortRule.TYPE && sortStyle == SortStyle.DESC) {
            comparator = this.descComparatorOnType;
        }
        Collections.sort(this.mWhiteBoardList, comparator);
        notifyDataSetChanged();
    }

    public String convertAndSaveData(String str, String str2, int i) {
        String convertToStringHtml;
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f04d425229494524714c6379623d02e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f04d425229494524714c6379623d02e");
        }
        HashMap<String, Object> allDataTempo = WhiteBoardDataStoreSnapshot.getSingleton().getAllDataTempo();
        switch (i) {
            case 0:
                try {
                    short stringToShort = TypeConverUtils.stringToShort(str2);
                    allDataTempo.put(str, Short.valueOf(stringToShort));
                    convertToStringHtml = TypeConverUtils.convertToStringHtml(stringToShort);
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                    return str2;
                }
            case 1:
                try {
                    int stringToInt = TypeConverUtils.stringToInt(str2);
                    allDataTempo.put(str, Integer.valueOf(stringToInt));
                    convertToStringHtml = TypeConverUtils.convertToStringHtml(stringToInt);
                    break;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return str2;
                }
            case 2:
                try {
                    long stringToLong = TypeConverUtils.stringToLong(str2);
                    allDataTempo.put(str, Long.valueOf(stringToLong));
                    convertToStringHtml = TypeConverUtils.convertToStringHtml(stringToLong);
                    break;
                } catch (Exception e3) {
                    e3.printStackTrace();
                    return str2;
                }
            case 3:
                try {
                    double stringToDouble = TypeConverUtils.stringToDouble(str2);
                    allDataTempo.put(str, Double.valueOf(stringToDouble));
                    convertToStringHtml = TypeConverUtils.convertToStringHtml(stringToDouble);
                    break;
                } catch (Exception e4) {
                    e4.printStackTrace();
                    return str2;
                }
            case 4:
                try {
                    float stringToFloat = TypeConverUtils.stringToFloat(str2);
                    allDataTempo.put(str, Float.valueOf(stringToFloat));
                    convertToStringHtml = TypeConverUtils.convertToStringHtml(stringToFloat);
                    break;
                } catch (Exception e5) {
                    e5.printStackTrace();
                    return str2;
                }
            case 5:
                try {
                    byte stringToByte = TypeConverUtils.stringToByte(str2);
                    allDataTempo.put(str, Byte.valueOf(stringToByte));
                    convertToStringHtml = TypeConverUtils.convertToStringHtml(stringToByte);
                    break;
                } catch (Exception e6) {
                    e6.printStackTrace();
                    return str2;
                }
            case 6:
                try {
                    char stringToChar = TypeConverUtils.stringToChar(str2);
                    allDataTempo.put(str, Character.valueOf(stringToChar));
                    convertToStringHtml = TypeConverUtils.convertToStringHtml(stringToChar);
                    break;
                } catch (Exception e7) {
                    e7.printStackTrace();
                    return str2;
                }
            case 7:
                String stringToString = TypeConverUtils.stringToString(str2);
                allDataTempo.put(str, stringToString);
                return TypeConverUtils.convertToStringHtml(stringToString);
            case 8:
                if (str2.equals("true") || str2.equals("false")) {
                    Boolean valueOf = Boolean.valueOf(TypeConverUtils.stringToBoolean(str2));
                    allDataTempo.put(str, valueOf);
                    return TypeConverUtils.convertToStringHtml(valueOf);
                }
                return str2;
            case 9:
                if (TypeConverUtils.isNullString(str2).booleanValue() || TypeConverUtils.isFitBooleanArray(str2).booleanValue()) {
                    boolean[] stringToBooleanArray = TypeConverUtils.stringToBooleanArray(str2);
                    allDataTempo.put(str, stringToBooleanArray);
                    return TypeConverUtils.convertToStringHtml(stringToBooleanArray);
                }
                return str2;
            case 10:
                try {
                    if (TypeConverUtils.isNullString(str2).booleanValue() || TypeConverUtils.isFitArray(str2).booleanValue()) {
                        short[] stringToShortArray = TypeConverUtils.stringToShortArray(str2);
                        allDataTempo.put(str, stringToShortArray);
                        convertToStringHtml = TypeConverUtils.convertToStringHtml(stringToShortArray);
                        break;
                    } else {
                        return str2;
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                    return str2;
                }
            case 11:
                try {
                    if (TypeConverUtils.isNullString(str2).booleanValue() || TypeConverUtils.isFitArray(str2).booleanValue()) {
                        int[] stringToIntArray = TypeConverUtils.stringToIntArray(str2);
                        allDataTempo.put(str, stringToIntArray);
                        convertToStringHtml = TypeConverUtils.convertToStringHtml(stringToIntArray);
                        break;
                    } else {
                        return str2;
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                    return str2;
                }
                break;
            case 12:
                try {
                    if (TypeConverUtils.isNullString(str2).booleanValue() || TypeConverUtils.isFitArray(str2).booleanValue()) {
                        long[] stringToLongArray = TypeConverUtils.stringToLongArray(str2);
                        allDataTempo.put(str, stringToLongArray);
                        convertToStringHtml = TypeConverUtils.convertToStringHtml(stringToLongArray);
                        break;
                    } else {
                        return str2;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return str2;
                }
            case 13:
                try {
                    if (TypeConverUtils.isNullString(str2).booleanValue() || TypeConverUtils.isFitArray(str2).booleanValue()) {
                        double[] stringToDoubleArray = TypeConverUtils.stringToDoubleArray(str2);
                        allDataTempo.put(str, stringToDoubleArray);
                        convertToStringHtml = TypeConverUtils.convertToStringHtml(stringToDoubleArray);
                        break;
                    } else {
                        return str2;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return str2;
                }
                break;
            case 14:
                try {
                    if (TypeConverUtils.isNullString(str2).booleanValue() || TypeConverUtils.isFitArray(str2).booleanValue()) {
                        float[] stringToFloatArray = TypeConverUtils.stringToFloatArray(str2);
                        allDataTempo.put(str, stringToFloatArray);
                        convertToStringHtml = TypeConverUtils.convertToStringHtml(stringToFloatArray);
                        break;
                    } else {
                        return str2;
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                    return str2;
                }
            case 15:
                try {
                    if (TypeConverUtils.isNullString(str2).booleanValue() || TypeConverUtils.isFitArray(str2).booleanValue()) {
                        byte[] stringToByteArray = TypeConverUtils.stringToByteArray(str2);
                        allDataTempo.put(str, stringToByteArray);
                        convertToStringHtml = TypeConverUtils.convertToStringHtml(stringToByteArray);
                        break;
                    } else {
                        return str2;
                    }
                } catch (Exception e13) {
                    e13.printStackTrace();
                    return str2;
                }
            case 16:
                try {
                    if (TypeConverUtils.isNullString(str2).booleanValue() || TypeConverUtils.isFitArray(str2).booleanValue()) {
                        char[] stringToCharArray = TypeConverUtils.stringToCharArray(str2);
                        allDataTempo.put(str, stringToCharArray);
                        convertToStringHtml = TypeConverUtils.convertToStringHtml(stringToCharArray);
                        break;
                    } else {
                        return str2;
                    }
                } catch (Exception e14) {
                    e14.printStackTrace();
                    return str2;
                }
            case 17:
                try {
                    if (TypeConverUtils.isNullString(str2).booleanValue() || TypeConverUtils.isFitArray(str2).booleanValue()) {
                        String[] stringToStringArray = TypeConverUtils.stringToStringArray(str2);
                        allDataTempo.put(str, stringToStringArray);
                        convertToStringHtml = TypeConverUtils.convertToStringHtml(stringToStringArray);
                        break;
                    } else {
                        return str2;
                    }
                } catch (Exception e15) {
                    e15.printStackTrace();
                    return str2;
                }
            case 18:
                CharSequence stringToCharSequence = TypeConverUtils.stringToCharSequence(str2);
                allDataTempo.put(str, stringToCharSequence);
                return TypeConverUtils.convertToStringHtml(stringToCharSequence);
            case 19:
                try {
                    if (TypeConverUtils.isNullString(str2).booleanValue() || TypeConverUtils.isFitArray(str2).booleanValue()) {
                        CharSequence[] stringToCharSequenceArray = TypeConverUtils.stringToCharSequenceArray(str2);
                        allDataTempo.put(str, stringToCharSequenceArray);
                        convertToStringHtml = TypeConverUtils.convertToStringHtml(stringToCharSequenceArray);
                        break;
                    } else {
                        return str2;
                    }
                } catch (Exception e16) {
                    e16.printStackTrace();
                    return str2;
                }
                break;
            case 20:
                try {
                    if (TypeConverUtils.isNullString(str2).booleanValue() || TypeConverUtils.isFitArray(str2).booleanValue()) {
                        ArrayList<CharSequence> stringToCharSequenceArrayList = TypeConverUtils.stringToCharSequenceArrayList(str2);
                        allDataTempo.put(str, stringToCharSequenceArrayList);
                        convertToStringHtml = TypeConverUtils.convertToStringHtml((ArrayList) stringToCharSequenceArrayList);
                        break;
                    } else {
                        return str2;
                    }
                } catch (Exception e17) {
                    e17.printStackTrace();
                    return str2;
                }
            case 21:
                try {
                    if (TypeConverUtils.isNullString(str2).booleanValue() || TypeConverUtils.isFitArray(str2).booleanValue()) {
                        ArrayList<Integer> stringToIntegerArrayList = TypeConverUtils.stringToIntegerArrayList(str2);
                        allDataTempo.put(str, stringToIntegerArrayList);
                        convertToStringHtml = TypeConverUtils.convertToStringHtml((ArrayList) stringToIntegerArrayList);
                        break;
                    } else {
                        return str2;
                    }
                } catch (Exception e18) {
                    e18.printStackTrace();
                    return str2;
                }
            case 22:
                try {
                    if (TypeConverUtils.isNullString(str2).booleanValue() || TypeConverUtils.isFitArray(str2).booleanValue()) {
                        ArrayList<String> stringToStringArrayList = TypeConverUtils.stringToStringArrayList(str2);
                        allDataTempo.put(str, stringToStringArrayList);
                        convertToStringHtml = TypeConverUtils.convertToStringHtml((ArrayList) stringToStringArrayList);
                        break;
                    } else {
                        return str2;
                    }
                } catch (Exception e19) {
                    e19.printStackTrace();
                    return str2;
                }
            default:
                return str2;
        }
        return convertToStringHtml;
    }

    private Comparator<DataEntry> getComparator(final SortStyle sortStyle, final TitleLayout.SortRule sortRule) {
        Object[] objArr = {sortStyle, sortRule};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecb8186df8d5c5dea77d40b3fe5ec011", RobustBitConfig.DEFAULT_VALUE) ? (Comparator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecb8186df8d5c5dea77d40b3fe5ec011") : new Comparator<DataEntry>() { // from class: com.dianping.shield.debug.whiteboard.WhiteBoardAdapter.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.util.Comparator
            public int compare(DataEntry dataEntry, DataEntry dataEntry2) {
                Object[] objArr2 = {dataEntry, dataEntry2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1d9def05a7b1bb02835963b51f24e404", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1d9def05a7b1bb02835963b51f24e404")).intValue() : sortStyle == SortStyle.ASC ? WhiteBoardAdapter.this.compareMyEntry(dataEntry, dataEntry2, sortRule) : -WhiteBoardAdapter.this.compareMyEntry(dataEntry, dataEntry2, sortRule);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int compareMyEntry(DataEntry dataEntry, DataEntry dataEntry2, TitleLayout.SortRule sortRule) {
        Object[] objArr = {dataEntry, dataEntry2, sortRule};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd917efeed795f3255a59ae1447f4020", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd917efeed795f3255a59ae1447f4020")).intValue();
        }
        if (dataEntry == dataEntry2) {
            return 0;
        }
        if (dataEntry == null) {
            return -1;
        }
        if (dataEntry2 == null) {
            return 1;
        }
        if (sortRule == TitleLayout.SortRule.KEY) {
            String key = dataEntry.getKey();
            String key2 = dataEntry2.getKey();
            if (key == null && key2 == null) {
                return 0;
            }
            if (key == null) {
                return -1;
            }
            if (key2 == null) {
                return 1;
            }
            return key.compareTo(key2);
        }
        return dataEntry.getType() - dataEntry2.getType();
    }

    private int getTagColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0ca71c67b91de6f13cbbe1e6c760a0d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0ca71c67b91de6f13cbbe1e6c760a0d")).intValue();
        }
        int parseColor = Color.parseColor("#FF6666");
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return Color.parseColor("#CCCCFF");
            case 6:
            case 7:
            case 18:
                return Color.parseColor("#99CCCC");
            case 8:
                return Color.parseColor("#FF6666");
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return Color.parseColor("#FFCCCC");
            case 16:
            case 17:
            case 19:
                return Color.parseColor("#99CC99");
            case 20:
            case 21:
            case 22:
                return Color.parseColor("#ABCDEF");
            default:
                return parseColor;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class ViewHolder extends RecyclerView.s {
        public static ChangeQuickRedirect changeQuickRedirect;
        protected LinearLayout deleteButton;
        private DeleteListener deleteListener;
        protected TextView deleteTextView;
        private EditListener editListener;
        protected TextView keyTextView;
        protected LinearLayout mType;
        protected LinearLayout showInfoView;
        private SpreadListener spreadListener;
        protected SwipeView swipeView;
        protected TextView typeTextView;
        protected TextView valueTextView;

        public ViewHolder(View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3) {
            super(view);
            Object[] objArr = {WhiteBoardAdapter.this, view, textView, textView2, textView3, textView4, linearLayout, linearLayout2, linearLayout3};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9cd3ad1a8ea0b7d221965ccb84618283", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9cd3ad1a8ea0b7d221965ccb84618283");
                return;
            }
            this.keyTextView = textView;
            this.valueTextView = textView2;
            this.typeTextView = textView3;
            this.deleteTextView = textView4;
            this.swipeView = (SwipeView) view;
            this.showInfoView = linearLayout;
            this.deleteButton = linearLayout2;
            this.mType = linearLayout3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class EditListener implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        public ViewHolder viewHolder;

        public EditListener(ViewHolder viewHolder) {
            Object[] objArr = {WhiteBoardAdapter.this, viewHolder};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c00151334ca4c6e41a44a4f38b58bd7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c00151334ca4c6e41a44a4f38b58bd7");
            } else {
                this.viewHolder = viewHolder;
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31eb7a58eba9c11cff27abd82c38a440", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31eb7a58eba9c11cff27abd82c38a440");
                return;
            }
            final DataEntry dataEntry = (DataEntry) WhiteBoardAdapter.this.mWhiteBoardList.get(this.viewHolder.getAdapterPosition());
            int type = dataEntry.getType();
            WhiteBoardAdapter.this.dialogSp.setSelection(type);
            WhiteBoardAdapter.this.dialogItemValue.setText(Html.fromHtml(dataEntry.getValue()));
            WhiteBoardAdapter.this.warnValue.setText("");
            if (type == 28 || type == 23 || type == 24 || type == 25 || type == 26 || type == 27) {
                WhiteBoardAdapter.this.dialogSp.setEnabled(false);
                WhiteBoardAdapter.this.dialogItemValue.setEnabled(false);
            } else {
                WhiteBoardAdapter.this.dialogSp.setEnabled(true);
                WhiteBoardAdapter.this.dialogItemValue.setEnabled(true);
            }
            WhiteBoardAdapter.this.alertDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.dianping.shield.debug.whiteboard.WhiteBoardAdapter.EditListener.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.content.DialogInterface.OnShowListener
                public void onShow(DialogInterface dialogInterface) {
                    Object[] objArr2 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "37915347cc63ca1b34051178fbb47a99", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "37915347cc63ca1b34051178fbb47a99");
                        return;
                    }
                    Button button = WhiteBoardAdapter.this.alertDialog.getButton(-1);
                    if (!WhiteBoardAdapter.this.dialogSp.isEnabled() || !WhiteBoardAdapter.this.dialogItemValue.isEnabled()) {
                        button.setEnabled(false);
                        return;
                    }
                    button.setEnabled(true);
                    button.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.debug.whiteboard.WhiteBoardAdapter.EditListener.1.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            Object[] objArr3 = {view2};
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "0b9da48f93920d39e4aafd0317998e8a", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "0b9da48f93920d39e4aafd0317998e8a");
                                return;
                            }
                            String key = dataEntry.getKey();
                            int selectedItemPosition = WhiteBoardAdapter.this.dialogSp.getSelectedItemPosition();
                            String obj = WhiteBoardAdapter.this.dialogItemValue.getText().toString();
                            String convertAndSaveData = WhiteBoardAdapter.this.convertAndSaveData(key, obj, selectedItemPosition);
                            if (convertAndSaveData.equals(obj)) {
                                WhiteBoardAdapter.this.warnValue.setText("格式错误，请重新确认类型和值");
                                return;
                            }
                            if (!convertAndSaveData.equals(dataEntry.getOriginValue()) || selectedItemPosition != dataEntry.getOriginType()) {
                                EditListener.this.setModifiedOperation(key);
                                dataEntry.setValue(convertAndSaveData);
                                dataEntry.setType(selectedItemPosition);
                                WhiteBoardAdapter.this.notifyItemChanged(EditListener.this.viewHolder.getAdapterPosition());
                            }
                            WhiteBoardAdapter.this.alertDialog.dismiss();
                        }
                    });
                }
            });
            WhiteBoardAdapter.this.alertDialog.show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModifiedOperation(String str) {
            WhiteBoardDataStoreSnapshot singleton;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa29e4109a7e0aef10e4ad44b32ab487", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa29e4109a7e0aef10e4ad44b32ab487");
                return;
            }
            if (WhiteBoardAdapter.this.operationTempo == null && (singleton = WhiteBoardDataStoreSnapshot.getSingleton()) != null) {
                WhiteBoardAdapter.this.operationTempo = singleton.getOperationTempo();
            }
            if (WhiteBoardAdapter.this.operationTempo != null) {
                WhiteBoardAdapter.this.operationTempo.put(str, Integer.valueOf(WhiteBoardDataStoreSnapshot.MODIFIED_OPERATION));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class DeleteListener implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        public AlertDialog.Builder alertDialog;
        protected Context context;
        protected ViewHolder viewHolder;

        public DeleteListener(Context context, ViewHolder viewHolder) {
            Object[] objArr = {WhiteBoardAdapter.this, context, viewHolder};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6438cb6468d1583b8ea54155507f81c0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6438cb6468d1583b8ea54155507f81c0");
                return;
            }
            this.context = context;
            this.viewHolder = viewHolder;
            this.alertDialog = new AlertDialog.Builder(context);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "723b2fd51610aaf5490ad0d71983a157", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "723b2fd51610aaf5490ad0d71983a157");
                return;
            }
            this.alertDialog.setTitle("Remove Item").setMessage("确定删除吗？").setPositiveButton("确定", new DialogInterface.OnClickListener() { // from class: com.dianping.shield.debug.whiteboard.WhiteBoardAdapter.DeleteListener.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f77a09b2c6d5174d4c0782d7fe8648b6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f77a09b2c6d5174d4c0782d7fe8648b6");
                        return;
                    }
                    int adapterPosition = DeleteListener.this.viewHolder.getAdapterPosition();
                    DeleteListener.this.setDeleteOperation(((DataEntry) WhiteBoardAdapter.this.mWhiteBoardList.get(adapterPosition)).getKey());
                    WhiteBoardAdapter.this.removeData(adapterPosition);
                }
            }).setNegativeButton(IPaymentManager.NO_ACTION, new DialogInterface.OnClickListener() { // from class: com.dianping.shield.debug.whiteboard.WhiteBoardAdapter.DeleteListener.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c156a682a40e10a2c9224e409dbd23dd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c156a682a40e10a2c9224e409dbd23dd");
                    } else {
                        DeleteListener.this.viewHolder.swipeView.closeMenu();
                    }
                }
            }).create();
            this.alertDialog.show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeleteOperation(String str) {
            WhiteBoardDataStoreSnapshot singleton;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0af5f3d5fa415735ae476c23451d1108", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0af5f3d5fa415735ae476c23451d1108");
                return;
            }
            if (WhiteBoardAdapter.this.operationTempo == null && (singleton = WhiteBoardDataStoreSnapshot.getSingleton()) != null) {
                WhiteBoardAdapter.this.operationTempo = singleton.getOperationTempo();
            }
            if (WhiteBoardAdapter.this.operationTempo != null) {
                WhiteBoardAdapter.this.operationTempo.put(str, Integer.valueOf(WhiteBoardDataStoreSnapshot.DELETE_OPERATION));
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class SpreadListener implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        private int LINES;
        private int SPREAD_MAX_LINES;
        private boolean selected;
        protected ViewHolder viewHolder;

        public SpreadListener(ViewHolder viewHolder) {
            Object[] objArr = {WhiteBoardAdapter.this, viewHolder};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1be96d745ee938aa7472a75da1d8c9a9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1be96d745ee938aa7472a75da1d8c9a9");
                return;
            }
            this.SPREAD_MAX_LINES = 999;
            this.LINES = 3;
            this.viewHolder = viewHolder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e02f771afc30dcc10e00f6b2763f266", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e02f771afc30dcc10e00f6b2763f266");
            } else if (!this.selected) {
                this.selected = true;
                this.viewHolder.valueTextView.setMaxLines(this.SPREAD_MAX_LINES);
            } else {
                this.selected = false;
                this.viewHolder.valueTextView.setMaxLines(this.LINES);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class SpinnerAdapter extends ArrayAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;
        private LayoutInflater inflater;
        private int resource;
        private int textViewResourceId;
        private String[] types;

        public SpinnerAdapter(@NonNull Context context, int i, int i2, @NonNull String[] strArr) {
            super(context, i, i2, strArr);
            Object[] objArr = {WhiteBoardAdapter.this, context, Integer.valueOf(i), Integer.valueOf(i2), strArr};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfdebca0011600d5a1d32af4bd46285e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfdebca0011600d5a1d32af4bd46285e");
                return;
            }
            this.resource = i;
            this.textViewResourceId = i2;
            this.types = strArr;
            this.inflater = LayoutInflater.from(context);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        @NonNull
        public View getView(int i, @Nullable View view, @NonNull ViewGroup viewGroup) {
            Object[] objArr = {Integer.valueOf(i), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95571e6fca4af70e6616a2a45032bce5", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95571e6fca4af70e6616a2a45032bce5");
            }
            if (view == null) {
                view = this.inflater.inflate(this.resource, (ViewGroup) null);
            }
            TextView textView = (TextView) view.findViewById(this.textViewResourceId);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, 0, 0, 0);
            layoutParams.gravity = GravityCompat.START;
            textView.setLayoutParams(layoutParams);
            textView.setTextColor(Color.parseColor(DiagnoseLog.GRAY));
            textView.setGravity(GravityCompat.START);
            textView.setText(WhiteBoardAdapter.types[i]);
            return view;
        }

        @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public View getDropDownView(int i, @Nullable View view, @NonNull ViewGroup viewGroup) {
            Object[] objArr = {Integer.valueOf(i), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a84ccdc97894d50a9e05f87998ca7a3", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a84ccdc97894d50a9e05f87998ca7a3");
            }
            if (view == null) {
                view = new TextView(getContext());
                view.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                view.setPadding(15, 15, 15, 15);
            }
            TextView textView = (TextView) view;
            textView.setText(WhiteBoardAdapter.types[i]);
            textView.setTextSize(2, 15.0f);
            return view;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public int getCount() {
            return this.types.length;
        }
    }
}
