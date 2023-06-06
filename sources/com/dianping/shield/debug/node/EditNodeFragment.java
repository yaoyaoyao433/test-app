package com.dianping.shield.debug.node;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.DialogFragment;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import com.dianping.shield.debug.NodeListDataStoreSnapshot;
import com.dianping.shield.node.cellnode.DividerConfigInfo;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.dianping.shield.node.useritem.BottomInfo;
import com.dianping.shield.node.useritem.TopInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class EditNodeFragment extends DialogFragment implements CompoundButton.OnCheckedChangeListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static RecyclerView.a curAdapter;
    private String[] booleanType;
    private Switch bottomInfoSwitch;
    private Spinner bottomInfo_endType;
    private Spinner bottomInfo_needAutoOffset;
    private EditText bottomInfo_offset;
    private Spinner bottomInfo_startType;
    private EditText cellBottomLineOffset;
    private EditText cellTopLineOffset;
    private View dialogView;
    private ArrayList<ShieldDisplayNode> displayNodeList;
    private String[] endType;
    private EditText footerGapHeight;
    private int groupId;
    private EditText headerGapHeight;
    private int nodeIndex;
    private ArrayList<String> nodeList;
    private Spinner nodeSelect;
    private int position;
    private EditText staggeredGridLeftMargin;
    private EditText staggeredGridRightMargin;
    private EditText staggeredGridXGap;
    private EditText staggeredGridYGap;
    private String[] starType;
    private Switch topInfoSwitch;
    private Spinner topInfo_endType;
    private Spinner topInfo_needAutoOffset;
    private EditText topInfo_offset;
    private Spinner topInfo_startType;

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97b99f7b34615d8f1f6ba7f8e8cace66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97b99f7b34615d8f1f6ba7f8e8cace66");
            return;
        }
        super.onCreate(bundle);
        this.groupId = getArguments().getInt("groupId");
        this.position = getArguments().getInt("positionId");
        this.displayNodeList = new ArrayList<>();
        this.nodeList = new ArrayList<>();
        generateNodeList();
        this.booleanType = getActivity().getResources().getStringArray(R.array.boolean_array);
        this.starType = getActivity().getResources().getStringArray(R.array.node_topinfo_starttype);
        this.endType = getActivity().getResources().getStringArray(R.array.node_topinfo_endType);
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bef71a7e3ca3c037322140d0a9fc9047", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bef71a7e3ca3c037322140d0a9fc9047");
        }
        this.dialogView = layoutInflater.inflate(R.layout.shield_nodede_update_viewcell_fragment, viewGroup, false);
        if (this.displayNodeList.size() == 0) {
            generateNodeList();
        }
        initViews();
        return this.dialogView;
    }

    private void generateNodeList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77ce32ca4e2f07986dde108f2b9fe250", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77ce32ca4e2f07986dde108f2b9fe250");
            return;
        }
        ShieldViewCell shieldViewCell = NodeListDataStoreSnapshot.getSingleton().getAllDataTempo().get(this.groupId).shieldViewCells.get(this.position);
        if (shieldViewCell != null) {
            Iterator<ShieldSection> it = shieldViewCell.shieldSections.iterator();
            int i = 1;
            while (it.hasNext()) {
                Iterator<ShieldRow> it2 = it.next().shieldRows.iterator();
                while (it2.hasNext()) {
                    Iterator<ShieldDisplayNode> it3 = it2.next().shieldDisplayNodes.iterator();
                    while (it3.hasNext()) {
                        this.displayNodeList.add(it3.next());
                        ArrayList<String> arrayList = this.nodeList;
                        arrayList.add("Node:" + i);
                        i++;
                    }
                }
            }
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Object[] objArr = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a996ccd11fc2947e05369233bbcfd81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a996ccd11fc2947e05369233bbcfd81");
        } else if (compoundButton == this.topInfoSwitch) {
            if (z || this.nodeIndex >= this.displayNodeList.size()) {
                return;
            }
            this.displayNodeList.get(this.nodeIndex).rowParent.setTopInfo(null);
        } else if (compoundButton != this.bottomInfoSwitch || z || this.nodeIndex >= this.displayNodeList.size()) {
        } else {
            this.displayNodeList.get(this.nodeIndex).rowParent.setBottomInfo(null);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class TextChangeListener implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;
        private ShieldDisplayNode tagNode;
        private View tagView;

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public TextChangeListener(ShieldDisplayNode shieldDisplayNode, View view) {
            Object[] objArr = {EditNodeFragment.this, shieldDisplayNode, view};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad84911815bf956cab806e0bf2c4377c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad84911815bf956cab806e0bf2c4377c");
                return;
            }
            this.tagView = view;
            this.tagNode = shieldDisplayNode;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Object[] objArr = {charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bab5bff488e3b22cd8aa1a1a4935576c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bab5bff488e3b22cd8aa1a1a4935576c");
            } else if (charSequence.toString().trim().length() > 0) {
                onTextChanged(charSequence.toString());
            }
        }

        public void onTextChanged(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e774eec24aec40241b27834439410a5f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e774eec24aec40241b27834439410a5f");
            } else if (this.tagView != EditNodeFragment.this.staggeredGridXGap) {
                if (this.tagView != EditNodeFragment.this.staggeredGridYGap) {
                    if (this.tagView != EditNodeFragment.this.staggeredGridLeftMargin) {
                        if (this.tagView != EditNodeFragment.this.staggeredGridRightMargin) {
                            if (this.tagView == EditNodeFragment.this.headerGapHeight) {
                                EditNodeFragment.this.checkNodeDivider(this.tagNode);
                                this.tagNode.dividerInfo.headerGapHeight = Integer.parseInt(str.trim());
                                return;
                            } else if (this.tagView == EditNodeFragment.this.footerGapHeight) {
                                EditNodeFragment.this.checkNodeDivider(this.tagNode);
                                this.tagNode.dividerInfo.footerGapHeight = Integer.parseInt(str.trim());
                                return;
                            } else if (this.tagView == EditNodeFragment.this.cellTopLineOffset) {
                                EditNodeFragment.this.checkNodeDivider(this.tagNode);
                                String[] split = str.split(CommonConstant.Symbol.COMMA);
                                if (split.length == 4) {
                                    this.tagNode.dividerInfo.cellTopLineOffset = new Rect(Integer.parseInt(split[0].trim()), Integer.parseInt(split[1].trim()), Integer.parseInt(split[2].trim()), Integer.parseInt(split[3].trim()));
                                    return;
                                }
                                return;
                            } else if (this.tagView == EditNodeFragment.this.cellBottomLineOffset) {
                                EditNodeFragment.this.checkNodeDivider(this.tagNode);
                                String[] split2 = str.split(CommonConstant.Symbol.COMMA);
                                if (split2.length == 4) {
                                    this.tagNode.dividerInfo.cellBottomLineOffset = new Rect(Integer.parseInt(split2[0].trim()), Integer.parseInt(split2[1].trim()), Integer.parseInt(split2[2].trim()), Integer.parseInt(split2[3].trim()));
                                    return;
                                }
                                return;
                            } else if (this.tagView == EditNodeFragment.this.topInfo_offset) {
                                EditNodeFragment.this.checkParentTopTopInfo(this.tagNode);
                                this.tagNode.rowParent.getTopInfo().offset = Integer.parseInt(str.trim());
                                return;
                            } else if (this.tagView == EditNodeFragment.this.bottomInfo_offset) {
                                EditNodeFragment.this.checkParentBottomInfo(this.tagNode);
                                this.tagNode.rowParent.getBottomInfo().offset = Integer.parseInt(str.trim());
                                return;
                            } else {
                                return;
                            }
                        }
                        this.tagNode.staggeredGridRightMargin = Integer.valueOf(Integer.parseInt(str.trim()));
                        return;
                    }
                    this.tagNode.staggeredGridLeftMargin = Integer.valueOf(Integer.parseInt(str.trim()));
                    return;
                }
                this.tagNode.staggeredGridYGap = Integer.valueOf(Integer.parseInt(str.trim()));
            } else {
                this.tagNode.staggeredGridXGap = Integer.valueOf(Integer.parseInt(str.trim()));
            }
        }
    }

    public static EditNodeFragment newInstance(int i, int i2, RecyclerView.a aVar) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bb968d4d40f8027dc30e7211500b3969", RobustBitConfig.DEFAULT_VALUE)) {
            return (EditNodeFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bb968d4d40f8027dc30e7211500b3969");
        }
        EditNodeFragment editNodeFragment = new EditNodeFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("groupId", i);
        bundle.putInt("positionId", i2);
        editNodeFragment.setArguments(bundle);
        curAdapter = aVar;
        return editNodeFragment;
    }

    private void initViews() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9b47a5ae749fe9eb508f76e298b3bf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9b47a5ae749fe9eb508f76e298b3bf3");
            return;
        }
        this.topInfoSwitch = (Switch) this.dialogView.findViewById(R.id.topInfo_switch);
        this.bottomInfoSwitch = (Switch) this.dialogView.findViewById(R.id.bottomInfo_switch);
        initNodeList();
        initFinish();
        this.topInfoSwitch.setOnCheckedChangeListener(this);
        this.bottomInfoSwitch.setOnCheckedChangeListener(this);
    }

    private void initFinish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d7de877ff29809080e505df4119023e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d7de877ff29809080e505df4119023e");
        } else {
            this.dialogView.findViewById(R.id.finish_btn).setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.debug.node.EditNodeFragment.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3467d32ddbbaa011263701f6e201aba1", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3467d32ddbbaa011263701f6e201aba1");
                        return;
                    }
                    EditNodeFragment.this.dismiss();
                    if (EditNodeFragment.curAdapter != null) {
                        EditNodeFragment.curAdapter.notifyDataSetChanged();
                    }
                }
            });
        }
    }

    private void initNodeList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c82cd32cc30f775a8dabb7787b5ea92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c82cd32cc30f775a8dabb7787b5ea92");
            return;
        }
        this.nodeSelect = (Spinner) this.dialogView.findViewById(R.id.node_select);
        if (this.nodeList.size() > 0) {
            this.nodeSelect.setAdapter((SpinnerAdapter) new ArrayAdapter(getActivity(), 17367049, this.nodeList));
            this.nodeSelect.setOnItemSelectedListener(new ItemChangeListener() { // from class: com.dianping.shield.debug.node.EditNodeFragment.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.debug.node.EditNodeFragment.ItemChangeListener
                public void itemChanged(AdapterView<?> adapterView, int i) {
                    Object[] objArr2 = {adapterView, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "286d6f6cd348225dca1aaa169768bd1e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "286d6f6cd348225dca1aaa169768bd1e");
                        return;
                    }
                    EditNodeFragment.this.nodeIndex = i;
                    if (i < EditNodeFragment.this.displayNodeList.size()) {
                        EditNodeFragment.this.initGridData(i);
                        EditNodeFragment.this.initDividerInfo(i);
                        EditNodeFragment.this.initTopInfo(i);
                        EditNodeFragment.this.initBottomInfo(i);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initGridData(int i) {
        String str;
        String str2;
        String str3;
        String str4;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e798bee55ce412b9581b403425554367", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e798bee55ce412b9581b403425554367");
            return;
        }
        this.staggeredGridXGap = (EditText) this.dialogView.findViewById(R.id.staggeredGridXGap);
        this.staggeredGridYGap = (EditText) this.dialogView.findViewById(R.id.staggeredGridYGap);
        this.staggeredGridLeftMargin = (EditText) this.dialogView.findViewById(R.id.staggeredGridLeftMargin);
        this.staggeredGridRightMargin = (EditText) this.dialogView.findViewById(R.id.staggeredGridRightMargin);
        ShieldDisplayNode shieldDisplayNode = this.displayNodeList.get(i);
        if (shieldDisplayNode != null) {
            EditText editText = this.staggeredGridXGap;
            if (shieldDisplayNode.staggeredGridXGap != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.staggeredGridXGap);
                str = sb.toString();
            } else {
                str = "";
            }
            editText.setText(str);
            EditText editText2 = this.staggeredGridYGap;
            if (shieldDisplayNode.staggeredGridYGap != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.staggeredGridYGap);
                str2 = sb2.toString();
            } else {
                str2 = "";
            }
            editText2.setText(str2);
            EditText editText3 = this.staggeredGridLeftMargin;
            if (shieldDisplayNode.staggeredGridLeftMargin != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.staggeredGridLeftMargin);
                str3 = sb3.toString();
            } else {
                str3 = "";
            }
            editText3.setText(str3);
            EditText editText4 = this.staggeredGridRightMargin;
            if (shieldDisplayNode.staggeredGridRightMargin != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.staggeredGridRightMargin);
                str4 = sb4.toString();
            } else {
                str4 = "";
            }
            editText4.setText(str4);
            this.staggeredGridXGap.addTextChangedListener(new TextChangeListener(shieldDisplayNode, this.staggeredGridXGap));
            this.staggeredGridYGap.addTextChangedListener(new TextChangeListener(shieldDisplayNode, this.staggeredGridYGap));
            this.staggeredGridLeftMargin.addTextChangedListener(new TextChangeListener(shieldDisplayNode, this.staggeredGridLeftMargin));
            this.staggeredGridRightMargin.addTextChangedListener(new TextChangeListener(shieldDisplayNode, this.staggeredGridRightMargin));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initDividerInfo(int i) {
        String str;
        String str2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a20f113b994aaca5547c78cb4c754ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a20f113b994aaca5547c78cb4c754ee");
            return;
        }
        this.headerGapHeight = (EditText) this.dialogView.findViewById(R.id.headerGapHeight);
        this.footerGapHeight = (EditText) this.dialogView.findViewById(R.id.footerGapHeight);
        this.cellTopLineOffset = (EditText) this.dialogView.findViewById(R.id.cellTopLineOffset);
        this.cellBottomLineOffset = (EditText) this.dialogView.findViewById(R.id.cellBottomLineOffset);
        ShieldDisplayNode shieldDisplayNode = this.displayNodeList.get(i);
        if (shieldDisplayNode.dividerInfo != null) {
            EditText editText = this.headerGapHeight;
            if (shieldDisplayNode.dividerInfo.headerGapHeight > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(shieldDisplayNode.dividerInfo.headerGapHeight);
                str = sb.toString();
            } else {
                str = "";
            }
            editText.setText(str);
            EditText editText2 = this.footerGapHeight;
            if (shieldDisplayNode.dividerInfo.footerGapHeight > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(shieldDisplayNode.dividerInfo.footerGapHeight);
                str2 = sb2.toString();
            } else {
                str2 = "";
            }
            editText2.setText(str2);
            this.cellTopLineOffset.setText(shieldDisplayNode.dividerInfo.cellTopLineOffset != null ? getStrFromRect(shieldDisplayNode.dividerInfo.cellTopLineOffset) : "");
            this.cellBottomLineOffset.setText(shieldDisplayNode.dividerInfo.cellBottomLineOffset != null ? getStrFromRect(shieldDisplayNode.dividerInfo.cellBottomLineOffset) : "");
        } else {
            this.headerGapHeight.setText("");
            this.footerGapHeight.setText("");
            this.cellTopLineOffset.setText("");
            this.cellBottomLineOffset.setText("");
        }
        this.headerGapHeight.addTextChangedListener(new TextChangeListener(shieldDisplayNode, this.headerGapHeight));
        this.footerGapHeight.addTextChangedListener(new TextChangeListener(shieldDisplayNode, this.footerGapHeight));
        this.cellTopLineOffset.addTextChangedListener(new TextChangeListener(shieldDisplayNode, this.cellTopLineOffset));
        this.cellBottomLineOffset.addTextChangedListener(new TextChangeListener(shieldDisplayNode, this.cellBottomLineOffset));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkNodeDivider(ShieldDisplayNode shieldDisplayNode) {
        Object[] objArr = {shieldDisplayNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1761c3c9dc2c8e66b9601290da7fd13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1761c3c9dc2c8e66b9601290da7fd13");
        } else if (shieldDisplayNode.dividerInfo == null) {
            shieldDisplayNode.dividerInfo = new DividerConfigInfo();
        }
    }

    private String getStrFromRect(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3eede1ff7276982bac52cf0c40158a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3eede1ff7276982bac52cf0c40158a1");
        }
        if (rect != null) {
            return rect.left + CommonConstant.Symbol.COMMA + rect.top + CommonConstant.Symbol.COMMA + rect.right + CommonConstant.Symbol.COMMA + rect.bottom;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initTopInfo(int i) {
        String str;
        int i2 = 0;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4493c17bb607eb7aa528462497e65d41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4493c17bb607eb7aa528462497e65d41");
            return;
        }
        this.topInfo_startType = (Spinner) this.dialogView.findViewById(R.id.topInfo_startType);
        this.topInfo_endType = (Spinner) this.dialogView.findViewById(R.id.topInfo_endType);
        this.topInfo_needAutoOffset = (Spinner) this.dialogView.findViewById(R.id.topInfo_needAutoOffset);
        this.topInfo_offset = (EditText) this.dialogView.findViewById(R.id.topInfo_offset);
        final ShieldDisplayNode shieldDisplayNode = this.displayNodeList.get(i);
        if (shieldDisplayNode.rowParent.getTopInfo() != null) {
            int i3 = 0;
            while (true) {
                if (i3 < this.starType.length) {
                    if (shieldDisplayNode.rowParent.getTopInfo().startType != null && this.starType[i3].equals(shieldDisplayNode.rowParent.getTopInfo().startType.name())) {
                        this.topInfo_startType.setSelection(i3);
                        break;
                    }
                    i3++;
                } else {
                    break;
                }
            }
            int i4 = 0;
            while (true) {
                if (i4 < this.endType.length) {
                    if (shieldDisplayNode.rowParent.getTopInfo().endType != null && this.endType[i4].equals(shieldDisplayNode.rowParent.getTopInfo().endType.name())) {
                        this.topInfo_endType.setSelection(i4);
                        break;
                    }
                    i4++;
                } else {
                    break;
                }
            }
            while (true) {
                if (i2 >= this.booleanType.length) {
                    break;
                } else if (this.booleanType[i2].equals(Boolean.valueOf(shieldDisplayNode.rowParent.getTopInfo().needAutoOffset))) {
                    this.topInfo_needAutoOffset.setSelection(i2);
                    break;
                } else {
                    i2++;
                }
            }
            EditText editText = this.topInfo_offset;
            if (shieldDisplayNode.rowParent.getTopInfo().offset > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(shieldDisplayNode.rowParent.getTopInfo().offset);
                str = sb.toString();
            } else {
                str = "";
            }
            editText.setText(str);
        }
        this.topInfo_startType.setOnItemSelectedListener(new ItemChangeListener() { // from class: com.dianping.shield.debug.node.EditNodeFragment.3
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.dianping.shield.debug.node.EditNodeFragment.ItemChangeListener
            public void itemChanged(AdapterView<?> adapterView, int i5) {
                Object[] objArr2 = {adapterView, Integer.valueOf(i5)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8371b5b5338e0aaf06fdfde181f3ac22", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8371b5b5338e0aaf06fdfde181f3ac22");
                    return;
                }
                EditNodeFragment.this.checkParentTopTopInfo(shieldDisplayNode);
                if (i5 != 0) {
                    shieldDisplayNode.rowParent.getTopInfo().startType = i5 == 1 ? TopInfo.StartType.SELF : TopInfo.StartType.ALWAYS;
                    return;
                }
                shieldDisplayNode.rowParent.getTopInfo().startType = null;
            }
        });
        this.topInfo_endType.setOnItemSelectedListener(new ItemChangeListener() { // from class: com.dianping.shield.debug.node.EditNodeFragment.4
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.dianping.shield.debug.node.EditNodeFragment.ItemChangeListener
            public void itemChanged(AdapterView<?> adapterView, int i5) {
                Object[] objArr2 = {adapterView, Integer.valueOf(i5)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9a45780fa80a3dd71d68be90bdc0ea00", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9a45780fa80a3dd71d68be90bdc0ea00");
                    return;
                }
                EditNodeFragment.this.checkParentTopTopInfo(shieldDisplayNode);
                if (i5 != 0) {
                    shieldDisplayNode.rowParent.getTopInfo().endType = i5 == 1 ? TopInfo.EndType.NONE : i5 == 2 ? TopInfo.EndType.MODULE : i5 == 3 ? TopInfo.EndType.SECTION : TopInfo.EndType.CELL;
                    return;
                }
                shieldDisplayNode.rowParent.getTopInfo().endType = null;
            }
        });
        this.topInfo_needAutoOffset.setOnItemSelectedListener(new ItemChangeListener() { // from class: com.dianping.shield.debug.node.EditNodeFragment.5
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.dianping.shield.debug.node.EditNodeFragment.ItemChangeListener
            public void itemChanged(AdapterView<?> adapterView, int i5) {
                Object[] objArr2 = {adapterView, Integer.valueOf(i5)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6aec3f12e4dd068003d45ee771c19d0f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6aec3f12e4dd068003d45ee771c19d0f");
                    return;
                }
                EditNodeFragment.this.checkParentTopTopInfo(shieldDisplayNode);
                shieldDisplayNode.rowParent.getTopInfo().needAutoOffset = i5 == 0;
            }
        });
        this.topInfo_offset.addTextChangedListener(new TextChangeListener(shieldDisplayNode, this.topInfo_offset));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkParentTopTopInfo(ShieldDisplayNode shieldDisplayNode) {
        Object[] objArr = {shieldDisplayNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a0ee7e4dd94f7d40505514120c72ffc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a0ee7e4dd94f7d40505514120c72ffc");
        } else if (shieldDisplayNode.rowParent.getTopInfo() == null) {
            shieldDisplayNode.rowParent.setTopInfo(new TopInfo());
        } else {
            this.topInfoSwitch.setChecked(true);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class ItemChangeListener implements AdapterView.OnItemSelectedListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public void itemChanged(AdapterView<?> adapterView, int i) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }

        public ItemChangeListener() {
            Object[] objArr = {EditNodeFragment.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "448ea3a255cfad19391ecea24621a486", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "448ea3a255cfad19391ecea24621a486");
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            Object[] objArr = {adapterView, view, Integer.valueOf(i), new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "726233ba05887e25ae1fdec15d4f4921", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "726233ba05887e25ae1fdec15d4f4921");
            } else {
                itemChanged(adapterView, i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initBottomInfo(int i) {
        String str;
        int i2 = 0;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81298b175f916ae93d6cdb545903b3b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81298b175f916ae93d6cdb545903b3b9");
            return;
        }
        this.bottomInfo_startType = (Spinner) this.dialogView.findViewById(R.id.bottomInfo_startType);
        this.bottomInfo_endType = (Spinner) this.dialogView.findViewById(R.id.bottomInfo_endType);
        this.bottomInfo_needAutoOffset = (Spinner) this.dialogView.findViewById(R.id.bottomInfo_needAutoOffset);
        this.bottomInfo_offset = (EditText) this.dialogView.findViewById(R.id.bottomInfo_offset);
        final ShieldDisplayNode shieldDisplayNode = this.displayNodeList.get(i);
        if (shieldDisplayNode.rowParent.getBottomInfo() != null) {
            int i3 = 0;
            while (true) {
                if (i3 < this.starType.length) {
                    if (shieldDisplayNode.rowParent.getBottomInfo().startType != null && this.starType[i3].equals(shieldDisplayNode.rowParent.getBottomInfo().startType.name())) {
                        this.bottomInfo_startType.setSelection(i3);
                        break;
                    }
                    i3++;
                } else {
                    break;
                }
            }
            int i4 = 0;
            while (true) {
                if (i4 < this.endType.length) {
                    if (shieldDisplayNode.rowParent.getBottomInfo().endType != null && this.endType[i4].equals(shieldDisplayNode.rowParent.getBottomInfo().endType.name())) {
                        this.bottomInfo_endType.setSelection(i4);
                        break;
                    }
                    i4++;
                } else {
                    break;
                }
            }
            while (true) {
                if (i2 >= this.booleanType.length) {
                    break;
                } else if (this.booleanType[i2].equals(String.valueOf(shieldDisplayNode.rowParent.getBottomInfo().needAutoOffset))) {
                    this.bottomInfo_needAutoOffset.setSelection(i2);
                    break;
                } else {
                    i2++;
                }
            }
            EditText editText = this.bottomInfo_offset;
            if (shieldDisplayNode.rowParent.getBottomInfo().offset > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(shieldDisplayNode.rowParent.getBottomInfo().offset);
                str = sb.toString();
            } else {
                str = "";
            }
            editText.setText(str);
        }
        this.bottomInfo_startType.setOnItemSelectedListener(new ItemChangeListener() { // from class: com.dianping.shield.debug.node.EditNodeFragment.6
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.dianping.shield.debug.node.EditNodeFragment.ItemChangeListener
            public void itemChanged(AdapterView<?> adapterView, int i5) {
                Object[] objArr2 = {adapterView, Integer.valueOf(i5)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "66759fcee474ac90c7b29b5d07874b88", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "66759fcee474ac90c7b29b5d07874b88");
                    return;
                }
                EditNodeFragment.this.checkParentBottomInfo(shieldDisplayNode);
                if (i5 != 0) {
                    shieldDisplayNode.rowParent.getBottomInfo().startType = i5 == 1 ? BottomInfo.StartType.SELF : BottomInfo.StartType.ALWAYS;
                    return;
                }
                shieldDisplayNode.rowParent.getBottomInfo().startType = null;
            }
        });
        this.bottomInfo_endType.setOnItemSelectedListener(new ItemChangeListener() { // from class: com.dianping.shield.debug.node.EditNodeFragment.7
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.dianping.shield.debug.node.EditNodeFragment.ItemChangeListener
            public void itemChanged(AdapterView<?> adapterView, int i5) {
                Object[] objArr2 = {adapterView, Integer.valueOf(i5)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2757be271bdd3c1e550eeb64724b465a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2757be271bdd3c1e550eeb64724b465a");
                    return;
                }
                EditNodeFragment.this.checkParentBottomInfo(shieldDisplayNode);
                if (i5 != 0) {
                    shieldDisplayNode.rowParent.getBottomInfo().endType = i5 == 1 ? BottomInfo.EndType.NONE : i5 == 2 ? BottomInfo.EndType.MODULE : i5 == 3 ? BottomInfo.EndType.SECTION : BottomInfo.EndType.CELL;
                }
            }
        });
        this.bottomInfo_needAutoOffset.setOnItemSelectedListener(new ItemChangeListener() { // from class: com.dianping.shield.debug.node.EditNodeFragment.8
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.dianping.shield.debug.node.EditNodeFragment.ItemChangeListener
            public void itemChanged(AdapterView<?> adapterView, int i5) {
                Object[] objArr2 = {adapterView, Integer.valueOf(i5)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7536bfcbb52e912775c4496d26817479", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7536bfcbb52e912775c4496d26817479");
                    return;
                }
                EditNodeFragment.this.checkParentBottomInfo(shieldDisplayNode);
                shieldDisplayNode.rowParent.getBottomInfo().needAutoOffset = i5 == 0;
            }
        });
        this.bottomInfo_offset.addTextChangedListener(new TextChangeListener(shieldDisplayNode, this.bottomInfo_offset));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkParentBottomInfo(ShieldDisplayNode shieldDisplayNode) {
        Object[] objArr = {shieldDisplayNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d4f7f54e4b79851407ff94e8c99c2ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d4f7f54e4b79851407ff94e8c99c2ea");
        } else if (shieldDisplayNode.rowParent.getBottomInfo() == null) {
            shieldDisplayNode.rowParent.setBottomInfo(new BottomInfo());
        } else {
            this.bottomInfoSwitch.setChecked(true);
        }
    }
}
