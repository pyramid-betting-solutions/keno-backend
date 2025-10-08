{{- define "backend.name" -}}
{{- default .Chart.Name .Values.nameOverride | trunc 63 | trimSuffix "-" -}}
{{- end -}}

{{- define "backend.fullname" -}}
{{- printf "%s-%s" (include "backend.name" .) .Release.Name | trunc 63 | trimSuffix "-" -}}
{{- end -}}