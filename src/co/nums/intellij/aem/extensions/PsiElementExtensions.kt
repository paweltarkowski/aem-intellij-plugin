package co.nums.intellij.aem.extensions

import co.nums.intellij.aem.htl.psi.HtlTokenTypes
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.LeafPsiElement

fun PsiElement.isHtlString() =
        this is LeafPsiElement
                && (this.elementType === HtlTokenTypes.SINGLE_QUOTED_STRING
                || this.elementType === HtlTokenTypes.DOUBLE_QUOTED_STRING)

fun PsiElement.isHtlExpressionToken() =
        this is LeafPsiElement
                && (this.elementType === HtlTokenTypes.EXPR_START
                || this.elementType === HtlTokenTypes.EXPR_END)