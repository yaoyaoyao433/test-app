package com.meituan.robust.resource.diff.data;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.ResourceConstant;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class APKDiffData extends BaseDiffData {
    public static final String ROBUST_RESOURCES_DIFF_RELATIVE_PATH = ResourceConstant.ROBUST_RESOURCES_DIFF_RELATIVE_PATH;
    public long oldResourcesArscCrc;

    public APKDiffData() {
        this.diffTypeName = CommonConstant.File.APK;
    }

    public void mergeDiffData(BaseDiffData baseDiffData) {
        this.addSet.addAll(baseDiffData.addSet);
        this.delSet.addAll(baseDiffData.delSet);
        this.modSet.addAll(baseDiffData.modSet);
        this.diffModSet.addAll(baseDiffData.diffModSet);
    }

    public LibDiffData getLibDiffData() {
        return (LibDiffData) getDiffData(new LibDiffData());
    }

    public ResDiffData getResDiffData() {
        return (ResDiffData) getDiffData(new ResDiffData());
    }

    public AssetsDiffData getAssetsDiffData() {
        return (AssetsDiffData) getDiffData(new AssetsDiffData());
    }

    public DexDiffData getDexDiffData() {
        return (DexDiffData) getDiffData(new DexDiffData());
    }

    public METAINFDiffData getMETAINFDiffData() {
        return (METAINFDiffData) getDiffData(new METAINFDiffData());
    }

    public ResourcesArscDiffData getResourcesArscDiffData() {
        return (ResourcesArscDiffData) getDiffData(new ResourcesArscDiffData());
    }

    public AndroidManifestDiffData getAndroidManifestDiffData() {
        return (AndroidManifestDiffData) getDiffData(new AndroidManifestDiffData());
    }

    private BaseDiffData getDiffData(BaseDiffData baseDiffData) {
        for (DataUnit dataUnit : this.addSet) {
            if (dataUnit.name.startsWith(baseDiffData.diffTypeName)) {
                baseDiffData.addSet.add(dataUnit);
            }
        }
        for (DataUnit dataUnit2 : this.delSet) {
            if (dataUnit2.name.startsWith(baseDiffData.diffTypeName)) {
                baseDiffData.delSet.add(dataUnit2);
            }
        }
        for (DataUnit dataUnit3 : this.modSet) {
            if (dataUnit3.name.startsWith(baseDiffData.diffTypeName)) {
                baseDiffData.modSet.add(dataUnit3);
            }
        }
        for (DataUnit dataUnit4 : this.diffModSet) {
            if (dataUnit4.name.startsWith(baseDiffData.diffTypeName)) {
                baseDiffData.diffModSet.add(dataUnit4);
            }
        }
        return baseDiffData;
    }

    public boolean isContains(String str) {
        for (DataUnit dataUnit : this.addSet) {
            if (dataUnit.name.equalsIgnoreCase(str)) {
                return true;
            }
        }
        for (DataUnit dataUnit2 : this.delSet) {
            if (dataUnit2.name.equalsIgnoreCase(str)) {
                return true;
            }
        }
        for (DataUnit dataUnit3 : this.modSet) {
            if (dataUnit3.name.equalsIgnoreCase(str)) {
                return true;
            }
        }
        for (DataUnit dataUnit4 : this.diffModSet) {
            if (dataUnit4.name.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
