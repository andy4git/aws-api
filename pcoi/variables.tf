variable "stage_name" {
  default = "dev9"
  type    = string
}

variable "backbone_url" {
  default = "https://consumer.dit.ehealthontario.ca/devops/sandbox/backbone"
  type    = string
}

variable "lob_url" {
  default = "http://dummy.apps.dev2.ecp.ehealthontario.ca"
  type    = string
}