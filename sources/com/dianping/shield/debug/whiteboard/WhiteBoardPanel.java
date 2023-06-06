package com.dianping.shield.debug.whiteboard;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.w;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.shield.debug.WhiteBoardDataStoreSnapshot;
import com.dianping.shield.debug.whiteboard.TitleLayout;
import com.dianping.shield.debug.whiteboard.WhiteBoardAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class WhiteBoardPanel {
    private static final int addDefaultType = 8;
    private static final String addDefaultValue = "null";
    public static ChangeQuickRedirect changeQuickRedirect;
    private WhiteBoardAdapter adapter;
    private HashMap<String, Object> allDataTempo;
    private Context context;
    private List<DataEntry> dataEntryList;
    private LinearLayoutManager layoutManager;
    private HashMap<String, Integer> operationTempo;

    public WhiteBoardPanel(Context context, RecyclerView recyclerView, TitleLayout titleLayout) {
        Object[] objArr = {context, recyclerView, titleLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32cd3a233dae54a848b50512a09b8cb3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32cd3a233dae54a848b50512a09b8cb3");
            return;
        }
        this.dataEntryList = new ArrayList();
        this.allDataTempo = null;
        this.operationTempo = null;
        this.context = context;
        WhiteBoardDataStoreSnapshot singleton = WhiteBoardDataStoreSnapshot.getSingleton();
        if (singleton != null) {
            this.allDataTempo = singleton.getAllDataTempo();
        }
        this.layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(this.layoutManager);
        initWhiteBoardPanel();
        this.adapter = new WhiteBoardAdapter(this.dataEntryList, context);
        this.adapter.sortEntry(WhiteBoardAdapter.SortStyle.ASC, TitleLayout.SortRule.TYPE);
        recyclerView.setAdapter(this.adapter);
        setSeperator(recyclerView);
        setAddItemEvent(titleLayout);
        addKeySortEvent(this.adapter, titleLayout);
        addTypeSortEvent(this.adapter, titleLayout);
    }

    private void initWhiteBoardPanel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22778faf74fbb7f5b9680f74d447112f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22778faf74fbb7f5b9680f74d447112f");
        } else if (this.allDataTempo != null) {
            for (Map.Entry<String, Object> entry : this.allDataTempo.entrySet()) {
                fillWhiteBoardPanelDataList(entry.getKey(), entry.getValue());
            }
        }
    }

    private void fillWhiteBoardPanelDataList(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c3baefadeaeb4e49105e4210a0f93d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c3baefadeaeb4e49105e4210a0f93d9");
            return;
        }
        DataEntry dataEntry = obj == null ? new DataEntry(str, TypeConverUtils.convertToStringHtml((String) null), 8) : null;
        if (obj instanceof Bundle) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml((Bundle) obj), 28);
        } else if (obj instanceof Byte) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml(((Byte) obj).byteValue()), 5);
        } else if (obj instanceof byte[]) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml((byte[]) obj), 15);
        } else if (obj instanceof Boolean) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml(((Boolean) obj).booleanValue()), 8);
        } else if (obj instanceof boolean[]) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml((boolean[]) obj), 9);
        } else if (obj instanceof Integer) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml(((Integer) obj).intValue()), 1);
        } else if (obj instanceof int[]) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml((int[]) obj), 11);
        } else if (isIntegerArrayList(obj)) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml((ArrayList) obj), 21);
        } else if (obj instanceof Long) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml(((Long) obj).longValue()), 2);
        } else if (obj instanceof long[]) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml((long[]) obj), 12);
        } else if (obj instanceof Short) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml(((Short) obj).shortValue()), 0);
        } else if (obj instanceof short[]) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml((short[]) obj), 10);
        } else if (obj instanceof Float) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml(((Float) obj).floatValue()), 4);
        } else if (obj instanceof float[]) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml((float[]) obj), 14);
        } else if (obj instanceof Double) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml(((Double) obj).doubleValue()), 3);
        } else if (obj instanceof double[]) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml((double[]) obj), 13);
        } else if (obj instanceof Character) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml(((Character) obj).charValue()), 6);
        } else if (obj instanceof char[]) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml((char[]) obj), 16);
        } else if (obj instanceof String) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml((String) obj), 7);
        } else if (obj instanceof String[]) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml((String[]) obj), 17);
        } else if (isStringArrayList(obj)) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml((ArrayList) obj), 22);
        } else if (obj instanceof CharSequence) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml((CharSequence) obj), 18);
        } else if (obj instanceof CharSequence[]) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml((CharSequence[]) obj), 19);
        } else if (isCharSequenceArrayList(obj)) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml((ArrayList) obj), 20);
        } else if (obj instanceof Parcelable) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml((Parcelable) obj), 23);
        } else if (obj instanceof Parcelable[]) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml((Parcelable[]) obj), 24);
        } else if (isParcelableArrayList(obj)) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml((ArrayList) obj), 25);
        } else if (isSparseParcelableArray(obj)) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml((SparseArray) obj), 26);
        } else if (obj instanceof Serializable) {
            dataEntry = new DataEntry(str, TypeConverUtils.convertToStringHtml((Serializable) obj), 27);
        }
        this.dataEntryList.add(dataEntry);
    }

    public boolean isIntegerArrayList(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66ce5a068980541c205cfb45c1237419", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66ce5a068980541c205cfb45c1237419")).booleanValue();
        }
        if (obj instanceof ArrayList) {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof Integer)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean isStringArrayList(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea97357519a5219e47955c002db50197", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea97357519a5219e47955c002db50197")).booleanValue();
        }
        if (obj instanceof ArrayList) {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof String)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean isCharSequenceArrayList(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3aa0fb34e42ff7385ff3a8c0ded98dcf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3aa0fb34e42ff7385ff3a8c0ded98dcf")).booleanValue();
        }
        if (obj instanceof ArrayList) {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof CharSequence)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean isParcelableArrayList(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1cd74f47f55fedb7c327f1ee804845e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1cd74f47f55fedb7c327f1ee804845e")).booleanValue();
        }
        if (obj instanceof ArrayList) {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof Parcelable)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean isSparseParcelableArray(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a3551bd68b77378ad3263950051c69c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a3551bd68b77378ad3263950051c69c")).booleanValue();
        }
        if (!(obj instanceof SparseArray)) {
            return false;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = (SparseArray) obj;
            if (i >= sparseArray.size()) {
                return true;
            }
            if (!(sparseArray.valueAt(i) instanceof Parcelable)) {
                return false;
            }
            i++;
        }
    }

    private void setSeperator(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e33fafae8c464d9603989d4da83d9a19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e33fafae8c464d9603989d4da83d9a19");
            return;
        }
        w wVar = new w(this.context, 1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#F5F5F5"));
        gradientDrawable.setSize(-1, 30);
        wVar.a(gradientDrawable);
        recyclerView.addItemDecoration(wVar);
    }

    private void setAddItemEvent(TitleLayout titleLayout) {
        Object[] objArr = {titleLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b75d38dafa4c55042c9e96d9ff25ffe7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b75d38dafa4c55042c9e96d9ff25ffe7");
            return;
        }
        LinearLayout linearLayout = new LinearLayout(this.context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        EditText editText = new EditText(this.context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(40, 0, 40, 0);
        editText.setInputType(131072);
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        linearLayout.addView(editText, layoutParams);
        TextView textView = new TextView(this.context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(60, 0, 60, 0);
        textView.setTextSize(14.0f);
        textView.setTextColor(Color.parseColor("#FF0000"));
        linearLayout.addView(textView, layoutParams2);
        titleLayout.setAddOnClickListener(new AnonymousClass2(editText, textView, new AlertDialog.Builder(this.context).setTitle("Add Keys").setView(linearLayout).setPositiveButton("确定", (DialogInterface.OnClickListener) null).setNegativeButton(IPaymentManager.NO_ACTION, new DialogInterface.OnClickListener() { // from class: com.dianping.shield.debug.whiteboard.WhiteBoardPanel.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0e1a9756450344384242331b97c51801", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0e1a9756450344384242331b97c51801");
                }
            }
        }).create()));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.shield.debug.whiteboard.WhiteBoardPanel$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ TextView val$addWarn;
        public final /* synthetic */ AlertDialog val$alertDialog;
        public final /* synthetic */ EditText val$keyInput;

        public AnonymousClass2(EditText editText, TextView textView, AlertDialog alertDialog) {
            this.val$keyInput = editText;
            this.val$addWarn = textView;
            this.val$alertDialog = alertDialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4378ff9065ba0c934dbf631b39bc07d9", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4378ff9065ba0c934dbf631b39bc07d9");
                return;
            }
            this.val$keyInput.setText("");
            this.val$addWarn.setText("");
            this.val$alertDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.dianping.shield.debug.whiteboard.WhiteBoardPanel.2.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.content.DialogInterface.OnShowListener
                public void onShow(DialogInterface dialogInterface) {
                    Object[] objArr2 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "088ee0148372a77f648cb8c9a83b9db6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "088ee0148372a77f648cb8c9a83b9db6");
                    } else {
                        AnonymousClass2.this.val$alertDialog.getButton(-1).setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.debug.whiteboard.WhiteBoardPanel.2.1.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // android.view.View.OnClickListener
                            public void onClick(View view2) {
                                Object[] objArr3 = {view2};
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "09756e7c965a50c6425ceb7a7b5d1d07", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "09756e7c965a50c6425ceb7a7b5d1d07");
                                    return;
                                }
                                String trim = AnonymousClass2.this.val$keyInput.getText().toString().trim();
                                if (trim.replaceAll(StringUtil.SPACE, "").length() > 0) {
                                    WhiteBoardPanel.this.setAddOperation(trim);
                                    WhiteBoardPanel.this.adapter.addData(trim, WhiteBoardPanel.this.adapter.convertAndSaveData(trim, "null", 8), 8, -1);
                                    WhiteBoardPanel.this.layoutManager.scrollToPosition(0);
                                    AnonymousClass2.this.val$alertDialog.dismiss();
                                    return;
                                }
                                AnonymousClass2.this.val$addWarn.setText("请输入key");
                            }
                        });
                    }
                }
            });
            this.val$alertDialog.show();
        }
    }

    private void addKeySortEvent(final WhiteBoardAdapter whiteBoardAdapter, final TitleLayout titleLayout) {
        Object[] objArr = {whiteBoardAdapter, titleLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1937a7d96d69ad75afecbca22b42042d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1937a7d96d69ad75afecbca22b42042d");
        } else {
            titleLayout.setKeySortOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.debug.whiteboard.WhiteBoardPanel.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aaa99d4e75ebe6bd19f3e437e4a91315", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aaa99d4e75ebe6bd19f3e437e4a91315");
                        return;
                    }
                    TitleLayout.SortRule sortRule = TitleLayout.SortRule.KEY;
                    if (titleLayout.isEqualSortTag(sortRule, "ASC")) {
                        titleLayout.setSortDESC(sortRule);
                        whiteBoardAdapter.sortEntry(WhiteBoardAdapter.SortStyle.DESC, sortRule);
                        return;
                    }
                    titleLayout.setSortASC(sortRule);
                    whiteBoardAdapter.sortEntry(WhiteBoardAdapter.SortStyle.ASC, sortRule);
                }
            });
        }
    }

    private void addTypeSortEvent(final WhiteBoardAdapter whiteBoardAdapter, final TitleLayout titleLayout) {
        Object[] objArr = {whiteBoardAdapter, titleLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ccc0ae4d7cc6c7c35090147c5e9cc0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ccc0ae4d7cc6c7c35090147c5e9cc0b");
        } else {
            titleLayout.setTypeSortOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.debug.whiteboard.WhiteBoardPanel.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f4662f90805edf0f1bd36f1eb4429d11", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f4662f90805edf0f1bd36f1eb4429d11");
                        return;
                    }
                    TitleLayout.SortRule sortRule = TitleLayout.SortRule.TYPE;
                    if (titleLayout.isEqualSortTag(sortRule, "ASC")) {
                        titleLayout.setSortDESC(sortRule);
                        whiteBoardAdapter.sortEntry(WhiteBoardAdapter.SortStyle.DESC, sortRule);
                        return;
                    }
                    titleLayout.setSortASC(sortRule);
                    whiteBoardAdapter.sortEntry(WhiteBoardAdapter.SortStyle.ASC, sortRule);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddOperation(String str) {
        WhiteBoardDataStoreSnapshot singleton;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d7ceecec87edce7027481b2e16ee602", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d7ceecec87edce7027481b2e16ee602");
            return;
        }
        if (this.operationTempo == null && (singleton = WhiteBoardDataStoreSnapshot.getSingleton()) != null) {
            this.operationTempo = singleton.getOperationTempo();
        }
        if (this.operationTempo != null) {
            this.operationTempo.put(str, Integer.valueOf(WhiteBoardDataStoreSnapshot.ADD_OPERATION));
        }
    }
}
