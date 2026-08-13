package model

sealed abstract class DocumentStatus(val value: String)

object DocumentStatus {
    case object DRAFT extends DocumentStatus("DRAFT")
    case object REVIEW extends DocumentStatus("REVIEW")
    case object APPROVED extends DocumentStatus("APPROVED")
    case object REJECTED extends DocumentStatus("REJECTED")
}