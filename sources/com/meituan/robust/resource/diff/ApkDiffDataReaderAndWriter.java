package com.meituan.robust.resource.diff;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.FileUtil;
import com.meituan.robust.common.TxtFileReaderAndWriter;
import com.meituan.robust.resource.APKStructure;
import com.meituan.robust.resource.diff.data.APKDiffData;
import com.meituan.robust.resource.diff.data.DataUnit;
import java.io.File;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ApkDiffDataReaderAndWriter {
    private static final Type TYPE = new TypeToken<APKDiffData>() { // from class: com.meituan.robust.resource.diff.ApkDiffDataReaderAndWriter.1
    }.getType();
    private static Gson gson = new GsonBuilder().enableComplexMapKeySerialization().setPrettyPrinting().create();

    public static APKDiffData readDiffData(File file) {
        String readFileAsString;
        if (file == null || !file.exists() || (readFileAsString = TxtFileReaderAndWriter.readFileAsString(file)) == null || readFileAsString.length() == 0) {
            return null;
        }
        return (APKDiffData) gson.fromJson(readFileAsString, TYPE);
    }

    public static void main(String[] strArr) {
        APKDiffData aPKDiffData = new APKDiffData();
        aPKDiffData.oldResourcesArscCrc = 3372233974L;
        aPKDiffData.diffTypeName = CommonConstant.File.APK;
        DataUnit dataUnit = new DataUnit();
        dataUnit.name = APKStructure.ResourcesArsc_Type;
        dataUnit.newCrc = 2912363016L;
        dataUnit.newMd5 = "e2a7e2d8469e1b5c2d4b5688bba80bc2";
        dataUnit.diffMd5 = "a8e134e31c06122cfd651989f7759e30";
        dataUnit.oldMd5 = "2a30f769a904a4d103939b83f295de6e";
        aPKDiffData.diffModSet.add(dataUnit);
        writeDiffData(new File("/Users/hedingxu/robust-github/Robust/app/resource_diff_data.robust_tmp"), aPKDiffData);
        if (readDiffData(new File("/Users/hedingxu/robust-github/Robust/app/resource_diff_data.robust_tmp")) == null) {
            System.err.println("blank ");
        }
    }

    public static boolean writeDiffData(File file, APKDiffData aPKDiffData) {
        String str;
        try {
            str = gson.toJson(aPKDiffData, TYPE);
        } catch (Throwable unused) {
            str = null;
        }
        if (file == null || str == null) {
            return false;
        }
        FileUtil.createFile(file.getAbsolutePath());
        TxtFileReaderAndWriter.writeFile(file, str);
        return true;
    }
}
