package com.dianping.picasso.model;

import android.text.TextWatcher;
import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class InputModel extends PicassoModel {
    public static final DecodingFactory<InputModel> PICASSO_DECODER = new DecodingFactory<InputModel>() { // from class: com.dianping.picasso.model.InputModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final InputModel[] createArray(int i) {
            return new InputModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final InputModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd5b514961af09f163f8f656b2a676d0", RobustBitConfig.DEFAULT_VALUE) ? (InputModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd5b514961af09f163f8f656b2a676d0") : new InputModel();
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public int actionType;
    public boolean autoAdjust;
    public float autoAdjustSpace;
    public boolean autoFocus;
    public int cursorIndex;
    public boolean editable;
    public String hint;
    public String hintColor;
    public int inputAlignment;
    public Boolean inputFocus;
    public int inputType;
    public PicassoModel keyboardAccessoryView;
    public PicassoModel keyboardView;
    public TextWatcher mTextWatcher;
    public int maxLength;
    public boolean multiline;
    public boolean secureTextEntry;
    public String text;
    public String textColor;
    public float textSize;

    public static int getActionType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "74f91fd3fbb93a1a9b60727cd5832bdd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "74f91fd3fbb93a1a9b60727cd5832bdd")).intValue();
        }
        switch (i) {
            case 0:
                return 6;
            case 1:
                return 3;
            case 2:
                return 5;
            case 3:
                return 2;
            case 4:
                return 4;
            default:
                return 0;
        }
    }

    public static int getInputType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "247c56ca78365a3e873f4241e37d90fe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "247c56ca78365a3e873f4241e37d90fe")).intValue();
        }
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 32;
            case 3:
                return 3;
            case 4:
                return 8194;
            case 5:
                return 129;
            default:
                return 0;
        }
    }

    public InputModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c53dd4248e86719a8aa9568a9dfe7c88", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c53dd4248e86719a8aa9568a9dfe7c88");
            return;
        }
        this.inputType = 0;
        this.actionType = 0;
        this.inputAlignment = 0;
        this.maxLength = 0;
        this.editable = true;
        this.cursorIndex = -1;
        this.autoAdjust = true;
        this.autoAdjustSpace = 0.0f;
        this.mTextWatcher = null;
    }

    @Override // com.dianping.picasso.model.PicassoModel
    public void readExtraProperty(int i, Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {Integer.valueOf(i), unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "adfbe6a98d2286f2908e78bff03c4bb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "adfbe6a98d2286f2908e78bff03c4bb0");
            return;
        }
        switch (i) {
            case 902:
                this.actionType = (int) unarchived.readDouble();
                return;
            case 11830:
                this.textColor = unarchived.readString();
                return;
            case 12650:
                this.maxLength = (int) unarchived.readDouble();
                return;
            case 15054:
                this.textSize = (float) unarchived.readDouble();
                return;
            case 16557:
                this.multiline = unarchived.readBoolean();
                return;
            case 17709:
                this.text = unarchived.readString();
                return;
            case 23342:
                this.inputFocus = Boolean.valueOf(unarchived.readBoolean());
                return;
            case 23836:
                this.hintColor = unarchived.readString();
                return;
            case 26148:
                this.inputType = (int) unarchived.readDouble();
                return;
            case 36153:
                this.inputAlignment = (int) unarchived.readDouble();
                return;
            case 45104:
                this.keyboardAccessoryView = (PicassoModel) unarchived.readObject(PicassoModel.PICASSO_DECODER);
                return;
            case 48233:
                this.autoFocus = unarchived.readBoolean();
                return;
            case 49550:
                this.secureTextEntry = unarchived.readBoolean();
                return;
            case 49694:
                this.autoAdjust = unarchived.readBoolean();
                return;
            case 51996:
                this.cursorIndex = (int) unarchived.readDouble();
                return;
            case 55084:
                this.keyboardView = (PicassoModel) unarchived.readObject(PicassoModel.PICASSO_DECODER);
                return;
            case 56967:
                this.hint = unarchived.readString();
                return;
            case 57736:
                this.autoAdjustSpace = (float) unarchived.readDouble();
                return;
            case 61028:
                this.editable = unarchived.readBoolean();
                return;
            default:
                super.readExtraProperty(i, unarchived);
                return;
        }
    }

    @Override // com.dianping.picasso.model.PicassoModel
    public boolean transformComponent(PicassoModel picassoModel) {
        Object[] objArr = {picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db51f756f177f46f7b1d65c40eb0f0a0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db51f756f177f46f7b1d65c40eb0f0a0")).booleanValue();
        }
        if (picassoModel == null || picassoModel.isNull()) {
            return false;
        }
        if (picassoModel.equalComponentId(this.keyboardAccessoryView)) {
            this.keyboardAccessoryView = picassoModel;
            return true;
        } else if (picassoModel.equalComponentId(this.keyboardView)) {
            this.keyboardView = picassoModel;
            return true;
        } else {
            return false;
        }
    }
}
