package co.nums.intellij.aem.htl.psi.extensions

import com.intellij.psi.XmlElementVisitor
import com.intellij.psi.xml.XmlTag

open class XmlElementVisitorExtension : XmlElementVisitor() {

    private var firstElement: XmlTag? = null

    override fun visitXmlTag(tag: XmlTag?) {
        if (firstElement == null) {
            firstElement = tag
        }
        super.visitXmlTag(tag)
    }

    fun getFirstElement(): XmlTag? {
        return firstElement
    }


}