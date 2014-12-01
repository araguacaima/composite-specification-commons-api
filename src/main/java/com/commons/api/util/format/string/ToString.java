package com.commons.api.util.format.string;

import org.apache.commons.lang3.builder.StandardToStringStyle;
import org.apache.commons.lang3.builder.ToStringBuilder;


public final class ToString {

    private static final StandardToStringStyle tiesStyle = new StandardToStringStyle();

    private static void setDefaultStyle() {

        tiesStyle.setArrayContentDetail(true);
        //Sets whether to output array content detail.
        tiesStyle.setArrayEnd("]");
        //Sets the array end text.
        tiesStyle.setArraySeparator(",");
        //Sets the array separator text.
        tiesStyle.setArrayStart("[");
        //Sets the array start text.
        tiesStyle.setContentEnd("\n");
        //Sets the content end text.
        tiesStyle.setContentStart("\n");
        //Sets the content start text.
        tiesStyle.setDefaultFullDetail(true);
        //Sets whether to use full detail when the caller doesn't specify.
        tiesStyle.setFieldNameValueSeparator(" = ");
        //Sets the field name value separator text.
        tiesStyle.setFieldSeparator("\n");
        //Sets the field separator text.
        tiesStyle.setFieldSeparatorAtEnd(false);
        //Sets whether the field separator should be added at the end of each buffer.
        tiesStyle.setFieldSeparatorAtStart(false);
        //Sets whether the field separator should be added at the start of each buffer.
        tiesStyle.setNullText("null");
        //Sets the text to output when null found.
        tiesStyle.setUseClassName(true);
        //Sets whether to use the class name.
        tiesStyle.setUseFieldNames(true);
        //Sets whether to use the field names passed in.
        tiesStyle.setUseIdentityHashCode(false);
        //Sets whether to use the identity hash code.
        tiesStyle.setUseShortClassName(true);
        //Sets whether to output short or long class names.
        tiesStyle.setArrayContentDetail(true);
        //Sets whether to output array content detail.
        tiesStyle.setDefaultFullDetail(true);
        //Sets whether to use full detail when the caller doesn't specify.

        ToStringBuilder.setDefaultStyle(tiesStyle);
    }

    public static String doStandartFormat(Object objectToFormat) {
        setDefaultStyle();
        return new ToStringBuilder(objectToFormat).toString();
    }

}
